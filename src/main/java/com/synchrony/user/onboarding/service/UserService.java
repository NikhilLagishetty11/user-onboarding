package com.synchrony.user.onboarding.service;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.UserDto;

public interface UserService {


    void register(UserDto userDto) throws Exception;

    boolean login(UserDto userDto) throws Exception;


}
