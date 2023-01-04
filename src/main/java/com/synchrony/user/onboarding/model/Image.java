package com.synchrony.user.onboarding.model;


/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {


    /**
     * Image Id (Unique)
     */
    private String imageId;

    /**
     * Name of the image
     */
    private String imageName;


}
