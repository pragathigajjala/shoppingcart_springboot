package com.ecommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.model.User;
import com.ecommerce.demo.repository.UserRepository;
import com.ecommerce.demo.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		return userservice.getAllUsers();
	}
}
