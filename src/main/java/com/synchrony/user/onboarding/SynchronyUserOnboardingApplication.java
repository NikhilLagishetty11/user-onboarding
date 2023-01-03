package com.synchrony.user.onboarding;

/**
 * Licensed Materials - Property of Synchrony. 2023 All Rights Reserved
 * US Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with Synchrony.
 *
 * @author NikhilLagishetty
 * @project user.boarding
 * @created-on 03/02/2023
 */


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Log4j2
@Configuration
@EnableWebMvc
public class SynchronyUserOnboardingApplication {


	private static String VERSION;

	@Value("${app.version:#{null}}")
	public void setVersion(String version){
		VERSION = version;
	}

	public static void main(String[] args) {
		SpringApplication.run(SynchronyUserOnboardingApplication.class, args);

		log.info("********************************************************************************");
		log.info("*                                                                              *");
		log.info("*                      User Boarding Service Started Successfully (v :{})   *",VERSION);
		log.info("*                                                                              *");
		log.info("********************************************************************************");

	}



}
