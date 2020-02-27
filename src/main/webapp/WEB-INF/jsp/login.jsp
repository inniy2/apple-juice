<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <script src="/js/main.js"></script>
    <form action="login" method="post">
		<input type="text" placeholder="Enter Username" name="user_name" required>
		<input type="password" placeholder="Enter Password" name="password" required>
		<button type="submit">Login</button>
    </form>
    <h2 class="hello-title">${message}</h2>
</body>
</html>