package com.synchrony.user.onboarding.controller;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.UserDto;
import com.synchrony.user.onboarding.model.User;
import com.synchrony.user.onboarding.repo.UserRepository;
import com.synchrony.user.onboarding.response.CommonCreateResponse;
import com.synchrony.user.onboarding.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Log4j2
@RestController
@RequestMapping("/onb/user")
@Validated
public class UserController {

    private final UserService userService;

    private final UserRepository userRepo;


    public UserController(UserService userService, UserRepository userRepo) {
        this.userService = userService;
        this.userRepo = userRepo;
    }


    @PostMapping("/register")
    public ResponseEntity<CommonCreateResponse> register(@RequestBody UserDto user) throws Exception {
        log.info("Register user request received. user name : {}", user.getUserName());
        boolean isDuplicateUser = checkDuplicateUser(user.getUserName());
        if (!isDuplicateUser) {
            throw new Exception("User Exists with Same User Name, Please use different user Name");
        } else {
            userService.register(user);
            return new ResponseEntity<>(new CommonCreateResponse("User Created Successfully", user.getUserName()), HttpStatus.CREATED);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<CommonCreateResponse> login(@RequestBody UserDto user) throws Exception {
        log.info("Login user request received. user name : {}", user.getUserName());
        userService.login(user);
        return new ResponseEntity<>(new CommonCreateResponse("User Successfully logged", user.getUserName()), HttpStatus.CREATED);
    }

    @GetMapping("/userdetails/{userName}")
    public UserDto userDetailsByUserName(@PathVariable String userName) throws Exception {
        log.info("Get user details by user name request received. user name : {}", userName);
        return userService.getUserDetailsByUserName(userName);
    }


    private boolean checkDuplicateUser(String userName) throws Exception {
        User user = userRepo.findUserByUserName(userName);
        if (Objects.isNull(user)) {
            return true;
        } else {
            return false;
        }
    }
}