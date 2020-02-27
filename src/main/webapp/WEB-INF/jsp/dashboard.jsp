<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <script src="/js/main.js"></script>
    <h2 class="hello-title">${message}</h2>
    <h2 class="hello-title">Hello ${user_name}</h2>
    
    <table border="1">
    	<tr>
    		<td>No</td>
    		<td>Shard</td>
    		<td>Schema</td>
    		<td>Definition</td>
    		<td>Start Time</td>
    	</tr>
			<c:forEach var="item" items="${dashboard}" varStatus="loop">
				<tr>
					<td>${loop.index+1}</td>
					<td>${item.shard}</td>
					<td>${item.table_schema}</td>
					<td>${item.table_definition}</td>
					<td>${item.start_time}</td>
				</tr>
			</c:forEach>
    </table>
    <br>
    <a href="/alterRegistration?user_name=${user_name}">New Alter</a>
    
</body>
</html>