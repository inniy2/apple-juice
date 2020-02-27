package com.bss.grape.schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alter_registration")
public class AlterRegistration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "alter_id", nullable = false)
	private Long id;
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(name = "shard", nullable = false)
	private String shard;
	@Column(name = "table_schema", nullable = false)
	private String tableSchema;
	@Column(name = "table_definition", nullable = false)
	private String tableDefinition;
	@Column(name = "master_host", nullable = false)
	private String masterHost;
	@Column(name = "ghost_host", nullable = false)
	private String ghostHost;
	@Column(name = "alter_statement", nullable = false)
	private String alterStatement;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getShard() {
		return shard;
	}
	public void setShard(String shard) {
		this.shard = shard;
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
	public String getMasterHost() {
		return masterHost;
	}
	public void setMasterHost(String masterHost) {
		this.masterHost = masterHost;
	}
	public String getGhostHost() {
		return ghostHost;
	}
	public void setGhostHost(String ghostHost) {
		this.ghostHost = ghostHost;
	}
	public String getAlterStatement() {
		return alterStatement;
	}
	public void setAlterStatement(String alterStatement) {
		this.alterStatement = alterStatement;
	}
	
	
	

}
