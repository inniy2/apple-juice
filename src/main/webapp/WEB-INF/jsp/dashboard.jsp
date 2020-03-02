<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link href="/css/main.css" rel="stylesheet">
    <script src="/js/main.js"></script>
</head>
<body>
    <h2 class="hello-title">${message}</h2>
    <h2 class="hello-title">Hello ${user_name}</h2>
    
    <table border="1">
    	<tr>
    		<td>No</td>
    		<td>Shard</td>
    		<td>Schema</td>
    		<td>Definition</td>
    		<td>Start Time</td>
    		<td>User Id</td>
    		<td>Status</td>
    		
    	</tr>
			<c:forEach var="item" items="${dashboard}" varStatus="loop">
				<tr>
					<td>${loop.index+1}</td>
					<td>${item.shard}</td>
					<td>${item.table_schema}</td>
					<td>${item.table_definition}</td>
					<td>${item.start_time}</td>
					<td>${item.user_id}</td>
					<td>Running</td>
				</tr>
			</c:forEach>
    </table>
    <br>
    
    
    <form action="/alterUserInput" method="post">
		<input type="hidden" name="user_name" value="${user_name}">
		<button type="submit">New Alter</button>
    </form>
    
</body>
</html>