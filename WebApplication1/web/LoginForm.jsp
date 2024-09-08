<%-- 
    Document   : LoginForm
    Created on : Apr 24, 2023, 5:39:07 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="logincheck.jsp">
            <div><input type="text" placeholder="enter your username" name="uname"/></div>
            <div><input type="password" placeholder="enter your password" name="pwd"/></div>
            <div> 
                <% 
                    String msg = request.getParameter("msg");
                    if(msg!=null)
                        out.println(msg);
                
                %> 
             </div>
            <div><input type="submit" value="login" name="submit"/></div>
            
        </form>
    </body>
</html>
