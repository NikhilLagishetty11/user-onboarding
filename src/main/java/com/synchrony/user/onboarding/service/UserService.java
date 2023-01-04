package com.synchrony.user.onboarding.service;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.UserDto;

import java.util.List;

public interface UserService {

    void register(UserDto userDto) throws Exception;

    void login(UserDto userDto) throws Exception;

    UserDto getUserDetailsByUserName(String userName) throws Exception;

   List<UserDto> getAllUsers() throws Exception;

}
