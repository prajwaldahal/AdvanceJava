<%-- 
    Document   : index
    Created on : May 29, 2023, 3:13:40 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%if (session.getAttribute("loggedIn") != null && (Boolean) session.getAttribute("loggedIn")) {
        
    }%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <form method="post" action="loginAction.jsp">
            <div><input type="text" placeholder="enter your username" name="uname"/></div>
            <div><input type="password" placeholder="enter your password" name="pwd"/></div>
            <div><input type="submit" value="login" name="submit"/></div>
            
        </form>
    </body>
</html>