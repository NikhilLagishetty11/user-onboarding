package com.synchrony.user.onboarding.service.serviceimpl;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.ImageDto;
import com.synchrony.user.onboarding.dto.UserDto;
import com.synchrony.user.onboarding.model.User;
import com.synchrony.user.onboarding.repo.UserRepository;
import com.synchrony.user.onboarding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;


    public static final String topic = "second_topic";

    public static final String deleteEmployeeTopic = "delete_employee_topic";

    public static final String updateEmployeeTopic = "update_employee_topic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, String> deleteEmployeeByIdKafkaTemplate;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void register(UserDto userDto) throws Exception {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        userRepo.save(user);
        publishMessageToKafka(user);
    }

    @Override
    public boolean login(UserDto userDto) throws Exception {
        User user = userRepo.findUserByUserName(userDto.getUserName());
        if(Objects.isNull(user)){
            throw new Exception("User Not Found, Please use correct user Name");
        } else if(!user.getPassword().equals(userDto.getPassword())){
            throw new Exception("Password incorrect, Please use correct correct password");
        } else {
            return true;
        }
    }

    @Override
    public UserDto getUserDetailsByUserName(String userName) throws Exception {
        User user = userRepo.findUserByUserName(userName);
        if(Objects.isNull(user)){
            throw new Exception("User Not Found, Please use correct user Name");
        }
        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        user.getImages().forEach(i->{
            ImageDto imageDto = new ImageDto();
            imageDto.setImageId(i.getImageId());
            imageDto.setImageName(i.getImageId());
            userDto.getImages().add(imageDto);
        });
        return userDto;
    }


    private void publishMessageToKafka(User user){
        this.kafkaTemplate.send(topic,user);
    }
}
