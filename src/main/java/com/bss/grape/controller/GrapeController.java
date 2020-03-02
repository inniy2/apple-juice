package com.bss.grape.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrapeController {
	
	@RequestMapping(value="/api/greeting", method=RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "Hello!";
	}
	
	@RequestMapping(value="/api/greeting2", method=RequestMethod.GET)
	@ResponseBody
	public String world() {
		return "world!";
	}
	
	

}
