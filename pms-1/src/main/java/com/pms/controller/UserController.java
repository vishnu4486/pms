package com.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.dto.LoginDto;
import com.pms.entity.User;
import com.pms.services.UsersService;
//@RequestMapping("users")
@RestController
public class UserController {

	@Autowired
	public UsersService userObj;

	@PostMapping("/")
	public User Register(@RequestBody User user) {

		return userObj.register(user);
//		return true;
	}

	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable("id") Integer id,@RequestBody User user) {
		user.setId(id);
		return userObj.updateUser(user);
//		return true;
	}

	@PostMapping("/login")
	public List<User> login(@RequestBody LoginDto login) {
		List<User> userList=userObj.login(login);
		return userList;

	}
	@GetMapping("/user")
	public List<User> getAll(){
		List<User> userList=userObj.getAll();
		return userList;
		
	}
	@GetMapping("/user/{id}")
	public User user(@PathVariable("id") Integer id){
		System.out.println(id);
		User userDetail=userObj.getById(id);
		System.out.println("jas : "+userDetail);
//		if(userDetail==null) {
//			//return "data not found";
//			throw new DataNotFoundException("User not Found");
//		}else {
//			return userDetail;
//			
//		}
			return userDetail;
	}
	
	@DeleteMapping("/user/{id}")
	public Boolean userDelete(@PathVariable("id") Integer id){
//		boolean userDetail=userObj.userDelete(id);
		if(userObj.userDelete(id))
		return true;
		return false;
	}



}

