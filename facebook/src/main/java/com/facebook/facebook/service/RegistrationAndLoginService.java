package com.facebook.facebook.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.facebook.dao.RegistrationAndLoginRepo;
import com.facebook.facebook.dto.APIResponse;
import com.facebook.facebook.dto.AppUsersDto;
import com.facebook.facebook.model.AppUsers;

@Service
public class RegistrationAndLoginService {

	@Autowired
	RegistrationAndLoginRepo registrationAndLoginRepo;

	public APIResponse register(AppUsersDto appUserDto) {

		Objects.requireNonNull(appUserDto);
		APIResponse ar = new APIResponse();

		try {
			AppUsers appUsers = new AppUsers();

			appUsers.setEmail(appUserDto.getEmail());
			appUsers.setPass(appUserDto.getPass());
			appUsers.setFname(appUserDto.getFname());
			appUsers.setLname(appUserDto.getLname());
			appUsers.setMname(appUserDto.getMname());
		
			if (Objects.isNull(registrationAndLoginRepo.findByEmail(appUserDto.getEmail()))) {

				registrationAndLoginRepo.save(appUsers);
			} else {

				ar.setHttpCode("3001");
				ar.setMessage(
						"user " + appUserDto.getFname() + " Already Present in DB with email " + appUserDto.getEmail());
				return ar;
			}
		

		} catch (Exception e) {

			ar.setHttpCode("50001");
			ar.setHttpMessage("FB Reg failled");
			ar.setMessage("ohh something got wrong .... please try again...");
			
			return ar;

		}

		ar.setHttpCode("200");
		ar.setHttpMessage("FB Reg success");
		ar.setMessage("You Got Registered Successfully.");
		return ar;
	}

}
