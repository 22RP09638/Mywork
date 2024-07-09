import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class student extends HttpServlet {

   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    
    response.setContentType("text/html"); 
    PrintWriter out = response.getWriter(); 

    HttpSession session = request.getSession(false); // Get existing session, do not create new
    
    if (session != null && "uname".equals("student@12")) { 
        String name = (String) session.getAttribute("uname"); 
       out. print("Hello, " + name + ". Welcome to your profile."); 
        request.getRequestDispatcher("studentpage.html").include(request, response); 
    } 
    else { 
        out.print("<script>alert('Please login first.'); window.location.href='index.html';</script>");
    } 
    
    out.close(); 
}
}
