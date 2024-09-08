<%-- 
    Document   : index
    Created on : Apr 24, 2023, 5:39:07 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% 
   Cookie[] cookies = request.getCookies();
   String user=null;
   String pwd=null;
   for(Cookie cookie:cookies){
        if(cookie.getName().equals("uname"))
            user=cookie.getValue();
            
        if(cookie.getName().equals("pwd"))
            pwd=cookie.getValue();
    }
    if(user!=null && pwd!=null)
          response.sendRedirect("LoginCheck.jsp?uname="+user+"&pwd="+pwd);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <form action="LoginCheck.jsp">
            <div><input type="text" placeholder="enter your username" name="uname"/></div>
            <div><input type="password" placeholder="enter your password" name="pwd"/></div>
            <div><input type="submit" value="login" name="submit"/></div>
            
        </form>
    </body>
</html>
