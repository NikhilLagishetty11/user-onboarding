package com.synchrony.user.onboarding.Config;

/**
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class SwaggerController {
    @RequestMapping(value = "/")
    public String index() {
        return "redirect:swagger-ui/index.html";
    }
}