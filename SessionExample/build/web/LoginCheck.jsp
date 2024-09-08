<%-- 
    Document   : LoginCheck
    Created on : Apr 25, 2023, 8:32:18 PM
    Author     : prajwal
--%>

<%@page import="org.apache.catalina.Session"%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    
    request.getSession(true);
    String uname=request.getParameter("uname");
    String password = request.getParameter("pwd");
    Cookie user=new Cookie("uname",uname);
    user.setMaxAge(84600);
    Cookie pwd=new Cookie("pwd",password);
    pwd.setMaxAge(84600);
    response.addCookie(user);
    response.addCookie(pwd);
    
    Connection c=null;
    try {
       
           Class.forName("com.mysql.jdbc.Driver"); 
           c=DriverManager.getConnection("jdbc:mysql://localhost:3307/AdvanceJava", "root", "");
           
           String sql="select username from userlogin where username=? and password=?";
           PreparedStatement  x= c.prepareStatement(sql);
           x.setString(1,uname);
           x.setString(2,password);
           ResultSet r = x.executeQuery();
           if(r.next()){
            if(r.getString("username").equals(uname)){
            
                 session.setAttribute("uname", uname);
                 response.sendRedirect("Dashboard.jsp");

             }
        }
        else{
        
            user.setMaxAge(0);
            pwd.setMaxAge(0);
            response.addCookie(user);
            response.addCookie(pwd);
            response.sendRedirect("index.jsp");
           
         
            
        }
       } catch (SQLException ex) {
           out.print(ex);
        }
        finally{
            if(c==null)
                c.close();
        }
    
    
%>

