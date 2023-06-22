<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Login JSP</title>
</head>
<body>
<% 
String u = request.getParameter("username");
String p = request.getParameter("password");
out.print("username: " + u + ";password: " + p);
%>
</body>
</html>