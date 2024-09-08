<%-- 
    Document   : CookieExample.jsp
    Created on : Apr 24, 2023, 7:45:49 AM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coookie Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    <% 
        Cookie cookie = new Cookie("user","prawal");
        Cookie cookie2 = new Cookie("age","20");
        cookie2.setMaxAge(30);
        cookie.setMaxAge(10);
        response.addCookie(cookie);
        response.addCookie(cookie2);
       for(Cookie cookie1:cookie3){
            System.out.println(cookie1.getValue());
        }
    %>
</html>
