package com.bss.grape.controller;



import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bss.grape.entity.MybatisMapper;
import com.bss.grape.entity.User;
import com.bss.grape.entity.AlterRegistration;
import com.bss.grape.entity.DashBoard;






@Controller
public class MVCController {
	
	private static final Logger logger = LoggerFactory.getLogger(MVCController.class);
	
	private final MybatisMapper mybatisMapper;
	
	public MVCController(MybatisMapper mybatisMapper) {
	    this.mybatisMapper = mybatisMapper;
	}
	
	
	@GetMapping({"/"})
    public String index() {
		return "login";
    }
	
	@GetMapping({"/login"})
    public String loginIndex() {
		return "login";
    }
	
	@PostMapping({"/login"})
    public String login(Model model,
    		RedirectAttributes redirectAttributes,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="password", required=false, defaultValue="") String password) {
		User user = this.mybatisMapper.userSelectByUserName(user_name);
		if(password.equals(user.getPass_word())) {
			model.addAttribute("user_name", user_name);
			redirectAttributes.addAttribute("user_name", user_name);
			return "redirect:/dashBoard";
		}else {
			model.addAttribute("message", "Wrong user name or password. Please try again");
			return "login";
		}
    }
	
	
	@GetMapping({"/dashBoard"})
	public String dashBoard(Model model,
			RedirectAttributes redirectAttributes,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name) {
		model.addAttribute("user_name", user_name);
		model.addAttribute("dashboard", mybatisMapper.dashBoardSelectAll());
		return "dashboard";
	}
	
	
	@PostMapping({"/alterUserInput"})
    public String alterRegistrationPost(Model model,
    		RedirectAttributes redirectAttributes,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name) {
		model.addAttribute("user_name", user_name);
		return "alteruserinput";
    }
	
	
	@PostMapping({"/checkDryRun"})
	public String checkDryRun(Model model,
			RedirectAttributes redirectAttributes,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="shard", required=false, defaultValue="") String shard,
    		@RequestParam(value="table_schema", required=false, defaultValue="") String table_schema,
    		@RequestParam(value="table_definition", required=false, defaultValue="") String table_definition,
    		@RequestParam(value="master_host", required=false, defaultValue="") String master_host,
    		@RequestParam(value="ghost_host", required=false, defaultValue="") String ghost_host,
    		@RequestParam(value="slave_host", required=false, defaultValue="") String slave_host,
    		@RequestParam(value="alter_statement", required=false, defaultValue="") String alter_statement) {
		
//		AlterRegistration alterReg = new AlterRegistration();
//		alterReg.setUser_name(user_name);
//		alterReg.setShard(shard);
//		alterReg.setTable_schema(table_schema);
//		alterReg.setTable_definition(table_definition);
//		alterReg.setMaster_host(master_host);
//		alterReg.setGhost_host(ghost_host);
//		alterReg.setSlave_host(slave_host);
//		alterReg.setAlter_statement(alter_statement);
//		
//		mybatisMapper.alterRegInsert(alterReg);
//		AlterRegistration alterId = mybatisMapper.alterRegSelectId(alterReg);
		
		model.addAttribute("user_name", user_name);
//		model.addAttribute("alter_id", alterId.getAlter_id());
		return "checkdryrun";
		
	}
	
	@PostMapping({"/execute"})
	public String execute(Model model,
			RedirectAttributes redirectAttributes,
	   		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="shard", required=false, defaultValue="") String shard,
    		@RequestParam(value="table_schema", required=false, defaultValue="") String table_schema,
    		@RequestParam(value="table_definition", required=false, defaultValue="") String table_definition,
    		@RequestParam(value="master_host", required=false, defaultValue="") String master_host,
    		@RequestParam(value="ghost_host", required=false, defaultValue="") String ghost_host,
    		@RequestParam(value="slave_host", required=false, defaultValue="") String slave_host,
    		@RequestParam(value="alter_statement", required=false, defaultValue="") String alter_statement) {
		
		DashBoard dashBoard = new DashBoard();
		dashBoard.setShard(shard);
		dashBoard.setTable_schema(table_schema);
		dashBoard.setTable_definition(table_definition);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		dashBoard.setStart_time(timestamp);
		dashBoard.setUser_id(user_name);
		mybatisMapper.bashBoardInsert(dashBoard);
		
		model.addAttribute("user_name", user_name);
		redirectAttributes.addAttribute("user_name", user_name);
		return "redirect:/dashBoard";
	}
	
	
	
}
