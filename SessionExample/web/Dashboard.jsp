<%-- 
    Document   : Dashboard
    Created on : Apr 25, 2023, 9:08:32 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard Page</title>
    </head>
    <body>
        <%
         try{   
              String user=session.getAttribute("uname").toString();
              out.print("welcome "+ user);
            }catch(Exception e){
                response.sendRedirect("index.jsp");
            }
        %>
        <form action="index.jsp">
            <input type="submit" value="logout" name="submit"/>
        </form>
    </body>
</html>
