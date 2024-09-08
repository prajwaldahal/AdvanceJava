<%-- 
    Document   : Form
    Created on : Apr 20, 2023, 7:32:20 PM
    Author     : prajwal
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <form action="CookieExample.jsp" method="post">
        <div><input type="text" placeholder="enter your name" name="name"/></div>
        <div><input type="text" placeholder="enter your address" name="addr"/></div>
        <div><input type="email" placeholder="enter your email" name="email"/></div>
            <div><input type="text" placeholder="enter your age" name="age"/></div>
            <div><input type="text" placeholder="enter your contact no:" name="contact"/></div>
            <div><input type="submit" value="submit" name="submit"/>
        </form> 
        
    </body>
    <%= request.getParameter("Name")%>
</html>
