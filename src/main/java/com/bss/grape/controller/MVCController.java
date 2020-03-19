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
import com.bss.orange.ghostGrpc;
import com.bss.orange.Ghost.APIResponse;
import com.bss.orange.Ghost.definitionRequest;
import com.bss.orange.Ghost.diskRequest;
import com.bss.orange.Ghost.ghostRequest;
import com.bss.orange.ghostGrpc.ghostBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="message", required=false, defaultValue="") String message) {
		model.addAttribute("user_name", user_name);
		model.addAttribute("message", message);
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
    		@RequestParam(value="ghost_host", required=false, defaultValue="") String ghost_host,
    		@RequestParam(value="table_schema", required=false, defaultValue="") String table_schema,
    		@RequestParam(value="table_definition", required=false, defaultValue="") String table_definition,
    		@RequestParam(value="slave_host", required=false, defaultValue="") String slave_host,
    		@RequestParam(value="alter_statement", required=false, defaultValue="") String alter_statement,
		    @RequestParam(value="mysql_dir", required=false, defaultValue="") String mysql_dir,
		    @RequestParam(value="grpc_port", required=false, defaultValue="") String grpc_port) {
		int port = Integer.parseInt(grpc_port);
		
		//Check duplication on dashboard
		DashBoard dashboard = new DashBoard();
		dashboard.setGhost_host(ghost_host);
		dashboard.setTable_schema(table_schema);
		dashboard.setTable_definition(table_definition);
		int count = mybatisMapper.dashBoardUniqueCount(dashboard);
		
		
		// Create channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress(ghost_host, port).usePlaintext().build();
		
		// Create stub object
		ghostBlockingStub ghostStub = ghostGrpc.newBlockingStub(channel);
		
		APIResponse response = null;
		
		// Construct disk request
		diskRequest diskRequest = com.bss.orange.Ghost.diskRequest.newBuilder().setDir(mysql_dir).build();
		response = ghostStub.diskcheck(diskRequest);
		String diskSize = response.getResponsemessage();
		int diskSizeCode = response.getResponsecode();
		
		// Construct definition request
		definitionRequest definitionRequest = com.bss.orange.Ghost.definitionRequest.newBuilder().
				setSchemaname(table_schema).
				setTablename(table_definition).build();
		response = ghostStub.checkdefinition(definitionRequest);
		String defintion = response.getResponsemessage();
		int defintionCode = response.getResponsecode();
		
		// Construct ghost request
		ghostRequest ghostRequest = com.bss.orange.Ghost.ghostRequest.newBuilder().
				setSchemaname(table_schema).
				setTablename(table_definition).
				setStatement(alter_statement).build();
		response = ghostStub.dryrun(ghostRequest);
		String dryrun = response.getResponsemessage();
		int dryrunCode = response.getResponsecode();
		
		model.addAttribute("user_name", user_name);
		model.addAttribute("ghost_host", ghost_host);
		model.addAttribute("table_schema", table_schema);
		model.addAttribute("slave_host", slave_host);
		model.addAttribute("alter_statement", alter_statement);
		
		model.addAttribute("diskSize", diskSize);
		model.addAttribute("definition", defintion);
		model.addAttribute("dryrun", dryrun);
		
		if(count >= 1) {
			redirectAttributes.addAttribute("user_name", user_name);
			redirectAttributes.addAttribute("message", ghost_host+"."+table_schema+"."+table_definition+" is in progress!");
			return "redirect:/dashBoard";
		}else if(diskSizeCode > 0) {
			redirectAttributes.addAttribute("user_name", user_name);
			redirectAttributes.addAttribute("message", "disk size error : " + diskSize);
			return "redirect:/dashBoard";
		}else if(defintionCode > 0) {
			redirectAttributes.addAttribute("user_name", user_name);
			redirectAttributes.addAttribute("message", "definition error: " + defintion);
			return "redirect:/dashBoard";
		}else if(dryrunCode > 0) {
			redirectAttributes.addAttribute("user_name", user_name);
			redirectAttributes.addAttribute("message", "dryrun error: " + dryrun);
			return "redirect:/dashBoard";
		}else {
			return "checkdryrun";
		}
		
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
		dashBoard.setGhost_host(shard);
		dashBoard.setTable_schema(table_schema);
		dashBoard.setTable_definition(table_definition);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		dashBoard.setStart_time(timestamp);
		dashBoard.setUser_id(user_name);
		dashBoard.setStatus("running");
		mybatisMapper.bashBoardInsert(dashBoard);
		
		/*
		 * TO DO
		 * Run gh-ost
		 */
		
		model.addAttribute("user_name", user_name);
		redirectAttributes.addAttribute("user_name", user_name);
		return "redirect:/dashBoard";
	}
	
	
	
}
