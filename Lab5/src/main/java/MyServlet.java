

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname =request.getParameter("uname");
        String age=request.getParameter("age");
        
        
        response.getWriter().print("user: "+uname+" age: "+age);
    }
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws  IOException, ServletException {
        processRequest(request, response);
    }

}
