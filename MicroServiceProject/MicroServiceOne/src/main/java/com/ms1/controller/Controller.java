package com.ms1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms1.model.Details;
import com.ms1.model.UserData;
import com.ms1.service.UserService;

@RestController
@RequestMapping("/ms1")
public class Controller {

	@Autowired
	private UserService service;

	@GetMapping("/getuser")
	public Details getUserData(@RequestParam int profileId) {

		return service.getUserData(profileId);
	}

	@PostMapping("/insertuser")
	public UserData insertData(@RequestBody UserData data) {
		return service.insertData(data);
	}

}
