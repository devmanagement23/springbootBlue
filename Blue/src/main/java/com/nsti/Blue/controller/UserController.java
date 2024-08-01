package com.nsti.Blue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.nsti.Blue.model.User;
import com.nsti.Blue.repository.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("http://localhost:5173")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
					//The @Autowired annotation is used to inject an instance of 
					//UserRepository into this controller. 
					//This allows the controller to interact with the database 
					//through the repository
	
	@PostMapping("/user")                         // when client hit /user,then it call createUser function
	User createUser(@RequestBody User newUser) {
		
						//@RequestBody annotation: The @RequestBody annotation on the newUser parameter 
							//in your controller method tells Spring Boot to: Parse the incoming JSON request body.
						//Convert it into a Java object of the type specified by the parameter (in this case, User).
						//Populate the fields of the User object with the corresponding values from the JSON.
		
		
		//return userRepository.save(newUser);
		
		 User savedUser = userRepository.save(newUser);
		 return savedUser;
		
		
	}
	
	/*
	@PostMapping("/user")
	User createUser(@RequestBody User incomingUser) {
	
	    User savedUser = userRepository.save(incomingUser);
	    return savedUser;
	}
	
	*/
	
	@GetMapping("/users")
	List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
