<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("uname");
    String password = request.getParameter("pwd");
    
    // Check if the username and password are correct (you can replace this with your own authentication logic)
    if (username.equals("admin") &&  password.equals("password")) {
        // Check if the user has an existing session
        if (session.getAttribute("loggedIn") == null) {
            // Set the session attribute to mark the user as logged in
            session.setAttribute("loggedIn", true);
        }
        
        response.sendRedirect("welcome.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>
