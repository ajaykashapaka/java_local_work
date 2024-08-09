import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet
{
   public void servlet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException 
   {
	   String firstname=request.getParameter("first");
	   String lastname=request.getParameter("last");
	   PrintWriter out=response.getWriter();
	   out.println(firstname+" "+lastname);
   }

}
