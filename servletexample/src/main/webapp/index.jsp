<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  

    // Create a new cookie
    Cookie cookie = new Cookie("user", "roshan");
    cookie.setMaxAge(3000); 
    response.addCookie(cookie);
    
    //retrieve
    out.println("Cookie:"+"\n"+cookie.getValue());
    
    //deleteCookie
    cookie.setMaxAge(0);
  
    response.addCookie(cookie);
    
    //create session
    session.setAttribute("user","roshan1");
    
    //retrieve session
    out.println("\nsession value: "+session.getAttribute("user"));
    
    //delete session
    session.removeAttribute("name");
%>
