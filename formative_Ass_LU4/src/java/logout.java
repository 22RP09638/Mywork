import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        HttpSession session = request.getSession(false);
    
        if (session != null) {
         
            session.invalidate();
        }
        
       
        response.setContentType("text/html");
        response.getWriter().println("<html><head><script>");
        response.getWriter().println("if(confirm('Are you sure you want to logout?')) {");
        response.getWriter().println("window.location.href = 'index.html';");
        response.getWriter().println("} else {");
        response.getWriter().println("window.history.back();");
        response.getWriter().println("}");
        response.getWriter().println("</script></head><body></body></html>");
    }

    @Override
    public String getServletInfo() {
        return "logout Servlet";
    }
}
