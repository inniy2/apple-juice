<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result of Dry run</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <script src="/js/main.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="hello.js"></script>
    
    <h2 class="hello-title">${message}</h2>
    <h2 class="hello-title">Hello ${user_name}</h2>
    
    Master is ${alterReg.master_host}<br>
    Alter syntax is ${alterReg.alter_statement}<br>
    
    <div>
            <p class="greeting-id">The ID is </p>
            <p class="greeting-content">The content is </p>
        </div>
    
    <p>available disk space is 300G</p>
    
    <p>
    	show create table is ... <br>
    	create table test_tb1
    	...
    </p>
    <form action="/alterUserInput" method="post">
    	<input hidden="text" name="user_name" value="${user_name}">
		<button type="submit">cancel</button>
    </form>
    
     <form action="/execute" method="post">
    	<input hidden="text" name="user_name" value="${user_name}">
    	<input hidden="text" name="shard" value="${alterReg.shard}">
		<input hidden="text" name="table_schema" value="${alterReg.table_schema}">
		<input hidden="text" name="table_definition" value="${alterReg.table_definition}">
		<input hidden="text" name="master_host" value="${alterReg.master_host}">
		<input hidden="text" name="ghost_host" value="${alterReg.ghost_host}">
		<input hidden="text" name="slave_host" value="${alterReg.slave_host}">
		<input hidden="text" name="alter_statement" value="${alterReg.alter_statement}">
		<button type="submit">execute</button>
    </form>
    
    
</body>
</html>