package com.bss.grape.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bss.grape.entity.User2;

import antlr.collections.List;



@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	private final CityMapper cityMapper;
	
	public LoginController(CityMapper cityMapper) {
	    this.cityMapper = cityMapper;
	}
	
	
	@GetMapping({"/login"})
    public String init() {
		return "login";
    }
	
	@PostMapping({"/login"})
    public String login() {
		logger.debug("LoginController-login called.");
		/* 
		 * TO-DO
		 * Change user column to unique
		 * Create login function
		 */
		// User user1 = (User)cityMapper.findByState("apple");
		User2 user = this.cityMapper.findByState("apple");
		logger.debug(user.getUser_name());
		logger.debug(user.getPass_word());
		
		User2 user2 = new User2();
		user2.setUser_name("abc");
		user2.setPass_word("efg");
		
		
		this.cityMapper.insert(user2);
		
		ArrayList<User2> userList = (ArrayList<User2>) this.cityMapper.findByStates();
		
		System.out.println(userList.size());
		
		ArrayList<User2> userLists = (ArrayList<User2>) this.cityMapper.findCardition();
		
		System.out.println(userLists.size());
		
		return "login";
    }
	
	
}
