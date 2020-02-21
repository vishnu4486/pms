package com.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.entity.User;
import com.pms.services.UsersService;

@RestController
public class ProjectController {
	
	@Autowired
	public UsersService userObj;
	
	@GetMapping("/project")
	public List<User> getAll(){
		List<User> userList=userObj.getAll();
		return userList;
		
	}
}
