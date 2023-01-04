package com.synchrony.user.onboarding.repo;


/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import com.synchrony.user.onboarding.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByUserName(String userName);

}