package com.ecommerce.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.repository.ProductRepository;
import com.ecommerce.demo.repository.UserRepository;

@Service
public class UserService {	
	@Autowired
	private UserRepository userrepo;
	
public List<User> getAllUsers()
{
	List<User> users=new ArrayList<>();
	userrepo.findAll().forEach(users::add);
	return users;
	}
}
