package com.pms.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.dto.LoginDto;
import com.pms.entity.User;
import com.pms.repository.UserRepository;

@Service
public class UsersService {

	@Autowired(required=true)
	private UserRepository userRepository;
	
	public User register(User user) {
		
	 return (userRepository.save(user));

	}
	
	public User updateUser(User user){
		userRepository.save(user);
		 return user;
	}
	
	@PersistenceContext
	EntityManager en;
	
	@Transactional
	public List<User>  login(LoginDto login) {
		List<User> userList=new ArrayList<>();
		userList=userRepository.findByuserNameAndpassword(login.getUserName(),login.getPassword());
		return userList;
	}
	public List<User> getAll(){
		List<User> userList=userRepository.findAll();
		return userList;
		
	}
	public User getById(Integer id) {
		Optional<User> u=userRepository.findById(id);
//		userRepository.get
		if(u.isPresent()) 
			return u.get();
		return null;
	}
	
//	@GetMapping("/students/{id}")
//	public Student retrieveStudent(@PathVariable long id) {
//		Optional<Student> student = studentRepository.findById(id);
//
//		if (!student.isPresent())
//			throw new StudentNotFoundException("id-" + id);
//
//		return student.get();
//	}
	
	public boolean userDelete(Integer id) {
		Optional<User> u=userRepository.findById(id);
		
		if(u.isPresent()) 
		{
			userRepository.deleteById(id);
			System.out.println("deleted successfully...");
			return true;
		}else {
			return false;
		}
			
		
	}
}
