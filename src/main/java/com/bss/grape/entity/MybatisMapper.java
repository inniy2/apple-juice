package com.bss.grape.entity;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
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
	@Select("SELECT dash_board_id, ghost_host, table_schema, table_definition, statement, start_time, user_id, status FROM dash_board")
	List<DashBoard> dashBoardSelectAll();
	
	@Select("SELECT count(*) FROM dash_board "
			+ "WHERE ghost_host = #{ghost_host} AND table_schema = #{table_schema} AND table_definition = #{table_definition}")
	int dashBoardUniqueCount(DashBoard dashboard);
	
	@Insert("INSERT INTO dash_board (ghost_host, table_schema, table_definition, statement, start_time, user_id, status) "
			+ "VALUES(#{ghost_host}, #{table_schema}, #{table_definition}, #{statement}, #{start_time}, #{user_id}, #{status})")
	@Options(useGeneratedKeys = true, keyProperty = "dash_board_id")
	void bashBoardInsert(DashBoard dashboard);
	
	@Delete("DELETE FROM dash_board "
			+ "WHERE dash_board_id = #{dash_board_id}")
	int deleteBoardRecord(int dash_board_id);
	
	
	
	//AlterRegister
	@Select("SELECT alter_id FROM alter_registration "
			+ "WHERE shard = #{shard} AND table_schema = #{table_schema} AND table_definition = #{table_definition}")
	AlterRegistration alterRegSelectId(AlterRegistration alterReg) throws Exception;
	
	@Insert("INSERT INTO alter_registration (user_name, shard, table_schema, table_definition, master_host, ghost_host, slave_host, alter_statement) "
			+ "VALUES(#{user_name}, #{shard}, #{table_schema}, #{table_definition}, #{master_host}, #{ghost_host}, #{slave_host}, #{alter_statement})")
	@Options(useGeneratedKeys = true, keyProperty = "alter_id", keyColumn = "alter_id")
	int alterRegInsert(AlterRegistration alterReg);
	
	
	
	
}
