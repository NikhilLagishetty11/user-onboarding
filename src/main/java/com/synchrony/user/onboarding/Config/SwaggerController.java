package com.synchrony.user.onboarding.Config;

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