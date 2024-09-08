<%-- 
    Document   : LoginForm
    Created on : Apr 24, 2023, 5:39:07 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String submit=request.getParameter("submit");
    if(submit!=null){
        String name=request.getParameter("uname");
        out.print("username:"+name);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="index.jsp">
            <div><input type="text" placeholder="enter your username" name="uname"/></div>
            <div><input type="password" placeholder="enter your password" name="pwd"/></div>
            <div><input type="submit" value="login" name="submit"/></div>
            
        </form>
    </body>
</html>
