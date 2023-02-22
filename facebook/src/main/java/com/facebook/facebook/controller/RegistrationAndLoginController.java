package com.facebook.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.facebook.dto.APIResponse;
import com.facebook.facebook.dto.AppUsersDto;
import com.facebook.facebook.service.RegistrationAndLoginService;

@RestController
public class RegistrationAndLoginController {

	@Autowired
	RegistrationAndLoginService registrationAndLoginService;

	@PostMapping("/registerMe")
	APIResponse register(@RequestBody AppUsersDto appUserDto) {

		return registrationAndLoginService.register(appUserDto) ;

	}

}
