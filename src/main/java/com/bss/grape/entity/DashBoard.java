package com.bss.grape.entity;

import java.sql.Timestamp;

public class DashBoard {

	private Long dash_board_id;
	private String ghost_host;
	private String table_schema;
	private String table_definition;
	private String statement;
	private Timestamp start_time;
	private String user_id;
	private String status;
	
	public Long getDash_board_id() {
		return dash_board_id;
	}
	public void setDash_board_id(Long dash_board_id) {
		this.dash_board_id = dash_board_id;
	}
	public String getGhost_host() {
		return ghost_host;
	}
	public void setGhost_host(String ghost_host) {
		this.ghost_host = ghost_host;
	}
	public String getTable_schema() {
		return table_schema;
	}
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	public String getTable_definition() {
		return table_definition;
	}
	public void setTable_definition(String table_definition) {
		this.table_definition = table_definition;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
