package com.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms2.model.Department;

@RestController
@RequestMapping("/ms2")
public class Controller {

	@GetMapping("/getdep")
	public Department getDepartment(@RequestParam int dep) {

		return null;
	}
}
