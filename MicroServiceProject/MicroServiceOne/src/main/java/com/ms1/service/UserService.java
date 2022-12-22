package com.ms1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.ms1.model.Details;
import com.ms1.model.UserData;
import com.ms1.repository.UserRepository;

@org.springframework.stereotype.Service
public class UserService {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private UserRepository repo;

	public Details getUserData(int profileId) {
		Details d = new Details();
		d.setData(repo.findById(profileId).get());
		d.setDep(restTemplate.getForObject("", null));
		return d;
	}

	public UserData insertData(UserData data) {
		return repo.save(data);
	}

}
