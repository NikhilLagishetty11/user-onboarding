package com.synchrony.user.onboarding.service.serviceimpl;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.UserDto;
import com.synchrony.user.onboarding.model.User;
import com.synchrony.user.onboarding.repo.UserRepository;
import com.synchrony.user.onboarding.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void register(UserDto userDto) throws Exception {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        userRepo.save(user);
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
}
