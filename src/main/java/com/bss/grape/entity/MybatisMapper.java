package com.bss.grape.entity;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface MybatisMapper {
	
	@Select("SELECT user_id, user_name, pass_word FROM user WHERE user_name = #{user_name}")
	User findByUserName(@Param("user_name") String user_name);
	
	@Select("SELECT dash_board_id, shard, table_schema, table_definition, start_time FROM dash_board")
	List<DashBoard> findAll();
	
	@Insert("INSERT INTO alter_registration (user_name, shard, table_schema, table_definition, master_host, ghost_host, alter_statement) "
			+ "VALUES(#{user_name}, #{shard}, #{table_schema}, #{table_definition}, #{master_host}, #{ghost_host}, #{alter_statement})")
	@Options(useGeneratedKeys = true, keyProperty = "alter_id")
	void insertAlterReg(AlterRegistration alterReg);
	
	
}
