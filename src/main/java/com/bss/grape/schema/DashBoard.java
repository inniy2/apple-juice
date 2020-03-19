package com.bss.grape.schema;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dash_board")
public class DashBoard {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "dash_board_id", nullable = false)
	private Long id;
	@Column(name = "ghost_host", nullable = false)
	private String ghostHost;
	@Column(name = "table_schema", nullable = false)
	private String tableSchema;
	@Column(name = "table_definition", nullable = false)
	private String tableDefinition;
	@Column(name = "statement", nullable = false)
	private String statement;
	@Column(name = "start_time", nullable = false)
	private Timestamp startTime;
	@Column(name = "user_id", nullable = false)
	private String userId;
	@Column(name = "status", nullable = false)
	private String status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGhostHost() {
		return ghostHost;
	}
	public void setGhostHost(String ghostHost) {
		this.ghostHost = ghostHost;
	}
	public String getTableSchema() {
		return tableSchema;
	}
	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}
	public String getTableDefinition() {
		return tableDefinition;
	}
	public void setTableDefinition(String tableDefinition) {
		this.tableDefinition = tableDefinition;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
