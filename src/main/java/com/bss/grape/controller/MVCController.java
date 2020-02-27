package com.bss.grape.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.bss.grape.entity.MybatisMapper;
import com.bss.grape.entity.User;
import com.bss.grape.entity.AlterRegistration;






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
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="password", required=false, defaultValue="") String password) {
//    		HttpServletResponse httpRespons) throws Exception {
		User user = this.mybatisMapper.findByUserName(user_name);
		if(password.equals(user.getPass_word())) {
			model.addAttribute("user_name", user_name);
			model.addAttribute("dashboard", mybatisMapper.findAll());
//			httpRespons.sendRedirect("/dashboard");
			return "dashboard";
		}else {
			model.addAttribute("message", "Wrong user name or password. Please try again");
			return "login";
		}
    }
	
	
	@GetMapping({"/alterRegistration"})
    public String alterRegistrationGet(Model model,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name) {
		model.addAttribute("user_name", user_name);
		return "alterregistration";
    }
	
	@PostMapping({"/alterRegistration"})
    public String alterRegistrationPost(Model model,
    		@RequestParam(value="user_name", required=false, defaultValue="") String user_name,
    		@RequestParam(value="shard", required=false, defaultValue="") String shard,
    		@RequestParam(value="table_schema", required=false, defaultValue="") String table_schema,
    		@RequestParam(value="table_definition", required=false, defaultValue="") String table_definition,
    		@RequestParam(value="master_host", required=false, defaultValue="") String master_host,
    		@RequestParam(value="ghost_host", required=false, defaultValue="") String ghost_host,
    		@RequestParam(value="alter_statement", required=false, defaultValue="") String alter_statement) {
		AlterRegistration alterReg = new AlterRegistration();
		alterReg.setUser_name(user_name);
		alterReg.setShard(shard);
		alterReg.setTable_schema(table_schema);
		alterReg.setTable_definition(table_definition);
		alterReg.setMaster_host(master_host);
		alterReg.setGhost_host(ghost_host);
		alterReg.setAlter_statement(alter_statement);
		mybatisMapper.insertAlterReg(alterReg);
		model.addAttribute("user_name", user_name);
		model.addAttribute("dashboard", mybatisMapper.findAll());
		return "dashboard";
    }
	
	
	
}
