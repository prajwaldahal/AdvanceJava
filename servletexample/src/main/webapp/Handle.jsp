<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    // Retrieve the existing cookie
    Cookie[] cookies = request.getCookies();
    String cookieValue = null;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("myCookie")) {
                cookieValue = cookie.getValue();
                break;
            }
        }
    }

    // Create a new cookie
    Cookie newCookie = new Cookie("myCookie", "CookieValue");
    newCookie.setMaxAge(3600); // Set the cookie's maximum age in seconds (e.g., 1 hour)
    newCookie.setPath("/"); // Set the cookie's path ("/" means it is accessible across the entire website)
    response.addCookie(newCookie);

    // Delete the cookie
    Cookie deleteCookie = new Cookie("myCookie", "");
    deleteCookie.setMaxAge(0);
    deleteCookie.setPath("/");
    response.addCookie(deleteCookie);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cookie and Session Handling</title>
</head>
<body>
    <h1>Cookie and Session Handling</h1>
    <p>Session ID: <%= session.getId() %></p>
    <p>Value from cookie: <%= cookieValue %></p>
</body>
</html>
