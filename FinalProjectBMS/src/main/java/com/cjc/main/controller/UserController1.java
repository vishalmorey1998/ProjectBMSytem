package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.serviesI.UserServiesI;

@RestController
public class UserController1 
{
	@Autowired UserServiesI usi;
	
			
	@PostMapping("/")
	public ResponseEntity<User> getAllDataToUser(@RequestBody User u)
	{
		User us	=	usi.AddAllData();
		return new ResponseEntity<User>(us,HttpStatus.OK);
	}
}
