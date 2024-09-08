<%-- 
    Document   : logincheck
    Created on : Apr 24, 2023, 5:45:52 PM
    Author     : prajwal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
    String name=request.getParameter("Name"); 
    int age=Integer.parseInt(request.getParameter("age"));
    String addr=request.getParameter("addr");
    String email=request.getParameter("email");
    String phone=request.getParameter("contact");
    Connection c;
       try {
           c=DriverManager.getConnection("jdbc:mysql://localhost:3307/AdvanceJava", "root", "");
           
           String sql="insert into userdata values(?,?,?,?,?)";
           PreparedStatement  x= c.prepareStatement(sql);
           x.setString(1,name);
           x.setString(2,addr);
           x.setString(3,email);
           x.setString(4,phone);
           
           x.setInt(5,age );
           x.execute();
           
       } catch (SQLException ex) {
            
       }
    
%>
