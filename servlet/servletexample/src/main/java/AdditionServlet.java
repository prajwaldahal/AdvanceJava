import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        // Retrieve the values of num1 and num2 from the form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        
        // Perform addition
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int result = num1 + num2;
        
        // Send the result back to the client
        response.setContentType("text/html");
        ServletOutputStream servetOutputStream =response.getOutputStream();
        response.getWriter().println("<h1>Result:</h1>");
        response.getWriter().println("<p>" + num1 + " + " + num2 + " = " + result + "</p>");
    }
}
