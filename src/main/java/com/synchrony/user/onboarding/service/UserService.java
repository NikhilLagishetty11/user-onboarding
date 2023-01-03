package com.synchrony.user.onboarding.service;

/**
 * Licensed Materials - Property of Synchrony. 2023 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with Synchrony.
 *
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.dto.UserDto;

public interface UserService {


    void register(UserDto userDto) throws Exception;

    boolean login(UserDto userDto) throws Exception;


}
