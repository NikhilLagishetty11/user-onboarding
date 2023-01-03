package com.synchrony.user.onboarding.model;

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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;
}
