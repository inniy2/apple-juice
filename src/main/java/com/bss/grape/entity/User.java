package com.bss.grape.entity;

public class User {
	
	private long user_id;
	private String user_names ;
	private String pass_word;
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_names;
	}
	public void setUser_name(String user_names) {
		this.user_names = user_names;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	

}
