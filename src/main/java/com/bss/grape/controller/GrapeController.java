package com.bss.grape.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bss.orange.Ghost.APIResponse;
import com.bss.orange.Ghost.diskRequest;
import com.bss.orange.Ghost.interactiveRequest;
import com.bss.orange.Ghost.definitionRequest;
import com.bss.orange.ghostGrpc;
import com.bss.orange.ghostGrpc.ghostBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@RestController
public class GrapeController {
	
	@RequestMapping(value="/api/checkdisk", method=RequestMethod.GET)
	@ResponseBody
	public String checkDisk() {
		// Create channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		// Create stub object
		ghostBlockingStub ghostStub = ghostGrpc.newBlockingStub(channel);
		
		// Construct request
		diskRequest diskRequest = com.bss.orange.Ghost.diskRequest.newBuilder().setDir("/").build();
		
		// Call
		APIResponse respone = ghostStub.diskcheck(diskRequest);
		
		System.out.println(respone.getResponsemessage());
		return respone.getResponsemessage();
	}
	
	@RequestMapping(value="/api/checkdefinition", method=RequestMethod.GET)
	@ResponseBody
	public String checkDefinition() {
		// Create channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		// Create stub object
		ghostBlockingStub ghostStub = ghostGrpc.newBlockingStub(channel);
		
		// Construct request
		definitionRequest definitionRequest = com.bss.orange.Ghost.definitionRequest.newBuilder().
				setSchemaname("test").
				setTablename("test_tbl1").build();
		
		// Call
		APIResponse respone = ghostStub.checkdefinition(definitionRequest);
		
		System.out.println(respone.getResponsemessage());
		return respone.getResponsemessage();
	}

	@RequestMapping(value="/api/cutover", method=RequestMethod.GET)
	@ResponseBody
	public void cutover(@RequestParam(value="board_id", required=false, defaultValue="") String board_id) {
		System.out.println(board_id);
	}

	@RequestMapping(value="/api/execute", method=RequestMethod.GET)
	@ResponseBody
	public void execute(@RequestParam(value="user_name", required=false, defaultValue="") String user_name) {
		System.out.println(user_name);
	}
	
	@RequestMapping(value="/api/ghostcommand", method=RequestMethod.GET)
	@ResponseBody
	public String ghostCommand(
			@RequestParam(value="ghost_host", required=false, defaultValue="") String ghost_host,
			@RequestParam(value="grpc_port", required=false, defaultValue="") String grpcPort,
			@RequestParam(value="table_schema", required=false, defaultValue="") String table_schema,
			@RequestParam(value="table_definition", required=false, defaultValue="") String table_definition,
			@RequestParam(value="ghostCommand", required=false, defaultValue="") String ghostCommand) {
		// Create channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress(ghost_host, Integer.parseInt(grpcPort)).usePlaintext().build();

		// Create stub object
		ghostBlockingStub ghostStub = ghostGrpc.newBlockingStub(channel);
		
		// Construct request
		interactiveRequest interactiveRequest = com.bss.orange.Ghost.interactiveRequest.newBuilder().
				setSchemaname(table_schema).
				setTablename(table_definition).
				setGhostcommand(ghostCommand).build();
		
		// Call
		APIResponse respone = ghostStub.interactive(interactiveRequest);
		
		
		System.out.println(respone.getResponsemessage());
		return respone.getResponsemessage();
	}
}
