package com.bss.grape.controller;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bss.grape.entity.User2;



@Mapper
public interface CityMapper {
	
	@Select("SELECT user_id, user_name, pass_word FROM user WHERE user_name = #{user_name}")
	User2 findByState(@Param("user_name") String user_name);
	
	@Insert("INSERT INTO user (user_name, pass_word) VALUES(#{user_name}, #{pass_word})")
	@Options(useGeneratedKeys = true, keyProperty = "user_id")
	void insert(User2 user2);
	
	@Select("SELECT user_id, user_name, pass_word FROM user")
	List<User2> findByStates();
	
	@Select("SELECT a.user_id, b.user_name, b.pass_word FROM user a Join user b")
	List<User2> findCardition();
	
	
	
}
