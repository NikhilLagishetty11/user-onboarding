package com.synchrony.user.onboarding.model;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * user id (Unique)
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     *  User name
     */
    private String userName;

    /**
     * Password
     */
    private String password;

    @Transient
    private List<Image> images = new ArrayList<>();
}
