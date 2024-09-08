<%-- 
    Document   : Welcome
    Created on : Apr 24, 2023, 6:01:46 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <h1>
            <% 
                boolean flag=true;
              Cookie []cookies=request.getCookies();
              for(Cookie cookie:cookies){
                   if(cookie.getName().equals("user")){
                        out.print("welcome "+cookie.getValue());
                        flag=false;
                    }
                    
                }
                if(flag){
                     //out.print("please login first");
                     response.sendRedirect("LoginForm.jsp");
                }
            %>
        </h1>
    </body>
</html>
