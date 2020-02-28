package com.bss.grape.entity;


public class AlterRegistration {

	private Long alter_id;
	private String user_name;
	private String shard;
	private String table_schema;
	private String table_definition;
	private String master_host;
	private String ghost_host;
	private String slave_host;
	private String alter_statement;
	public Long getAlter_id() {
		return alter_id;
	}
	public void setAlter_id(Long alter_id) {
		this.alter_id = alter_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getShard() {
		return shard;
	}
	public void setShard(String shard) {
		this.shard = shard;
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
	public String getMaster_host() {
		return master_host;
	}
	public void setMaster_host(String master_host) {
		this.master_host = master_host;
	}
	public String getGhost_host() {
		return ghost_host;
	}
	public void setGhost_host(String ghost_host) {
		this.ghost_host = ghost_host;
	}
	public String getAlter_statement() {
		return alter_statement;
	}
	public void setAlter_statement(String alter_statement) {
		this.alter_statement = alter_statement;
	}
	public String getSlave_host() {
		return slave_host;
	}
	public void setSlave_host(String slave_host) {
		this.slave_host = slave_host;
	}
	
}
