<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Alter Registration</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <script src="/js/main.js"></script>
    <h2 class="hello-title">${message}</h2>
    <h2 class="hello-title">Hello ${user_name}</h2>
    
    <form action="/alterRegistration" method="post">
    	<input hidden="text" name="user_name" value="${user_name}">
		<input type="text" placeholder="Shard Name" name="shard" required>
		<input type="text" placeholder="Table Schema Name" name="table_schema" required>
		<input type="text" placeholder="Table Definition Name" name="table_definition" required>
		<input type="text" placeholder="MySQL Master Host Name" name="master_host" required>
		<input type="text" placeholder="Ghost Host Name" name="ghost_host" required>
		<textarea placeholder="Alter Statement" name="alter_statement" required></textarea>
		<button type="submit">register</button>
    </form>
 
</body>
</html>