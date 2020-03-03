package com.bss.grape.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrapeController {
	
	@RequestMapping(value="/api/checkdisk", method=RequestMethod.GET)
	@ResponseBody
	public String checkDisk() {
		return "300G";
	}
	
	@RequestMapping(value="/api/checkdefinition", method=RequestMethod.GET)
	@ResponseBody
	public String checkDefinition() {
		return "CREATE TABLE ....";
	}

	@RequestMapping(value="/api/cutover", method=RequestMethod.GET)
	@ResponseBody
	public void cutover(@RequestParam(value="board_id", required=false, defaultValue="") String board_id) {
		
		System.out.println(board_id);
	}

}
