<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="person" class="PersonBean" scope="session" />

<jsp:setProperty name="person" property="name" value="<%= request.getParameter("name") %>" />
<jsp:setProperty name="person" property="age" value="<%= request.getParameter("age") %>" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Information</title>
</head>
<body>
    <h1>Person Information</h1>
    <p>Name: <jsp:getProperty name="person" property="name" /></p>
    <p>Age: <jsp:getProperty name="person" property="age" /></p>
</body>
</html>
