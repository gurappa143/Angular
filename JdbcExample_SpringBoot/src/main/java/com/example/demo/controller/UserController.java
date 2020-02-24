package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserDAO;

@RestController
public class UserController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/user")
	public List<User> getDetails(){
		return userDAO.findAll();
	}
	
	@RequestMapping("/userbyid")
	public User getDetailsById() {
		return userDAO.getById(0);
	}
	
	@RequestMapping("/user1")
	public List<User> getDetails1(){
		return userDAO.findAll1();
	}
	
	@RequestMapping("/update")
	public int update(){
		return userDAO.updateName();
	}
	
	@RequestMapping("/delete")
	public int deleteById() {
		return userDAO.deleteById();
	}
}
