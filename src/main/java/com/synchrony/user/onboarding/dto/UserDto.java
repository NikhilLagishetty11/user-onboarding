package com.synchrony.user.onboarding.dto;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    @NotNull(message = "Please enter user name")
    private String userName;

    @NotNull(message = "Please enter password")
    private String password;

    private List<ImageDto> images = new ArrayList<>();

}
