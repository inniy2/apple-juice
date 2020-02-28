package com.bss.grape.entity;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface MybatisMapper {
	
	// User
	@Select("SELECT user_id, user_name, pass_word FROM user WHERE user_name = #{user_name}")
	User userSelectByUserName(@Param("user_name") String user_name);
	
	
	
	//DashBoard
	@Select("SELECT dash_board_id, shard, table_schema, table_definition, start_time, user_id FROM dash_board")
	List<DashBoard> dashBoardSelectAll();
	
	@Insert("INSERT INTO dash_board (shard, table_schema, table_definition, start_time, user_id) "
			+ "VALUES(#{shard}, #{table_schema}, #{table_definition}, #{start_time}, #{user_id})")
	@Options(useGeneratedKeys = true, keyProperty = "dash_board_id")
	void bashBoardInsert(DashBoard dashBoard);
	
	
	
	//AlterRegister
	@Insert("INSERT INTO alter_registration (user_name, shard, table_schema, table_definition, master_host, ghost_host, slave_host, alter_statement) "
			+ "VALUES(#{user_name}, #{shard}, #{table_schema}, #{table_definition}, #{master_host}, #{ghost_host}, #{slave_host}, #{alter_statement})")
	@Options(useGeneratedKeys = true, keyProperty = "alter_id")
	void alterRegInsert(AlterRegistration alterReg);
	
	@Select("SELECT alter_id FROM alter_registration "
			+ "WHERE user_name = #{user_name} AND shard = #{shard} AND table_schema = #{table_schema} AND table_definition = #{table_definition} AND master_host = #{master_host} AND ghost_host = #{ghost_host} AND slave_host = #{slave_host} AND alter_statement = #{alter_statement}")
	AlterRegistration alterRegSelectId(AlterRegistration alterReg);
	
	
}
