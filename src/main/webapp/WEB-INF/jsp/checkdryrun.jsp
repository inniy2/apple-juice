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
    <h2 class="hello-title">${message}</h2>
    <h2 class="hello-title">Hello ${user_name}</h2>
    
    ${alterReg.ghost_host}<br>
    
    
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
		<button type="submit">execute</button>
    </form>
    
    
</body>
</html>