package com.synchrony.user.onboarding.dto;

/**
 * Licensed Materials - Property of Synchrony. 2023 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with Synchrony.
 *
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String userName;

    private String password;

}
