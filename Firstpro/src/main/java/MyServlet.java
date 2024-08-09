import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServlet implements Servlet 
{

	@Override
	public void destroy() 
	{ 
		
	}
	@Override
	public ServletConfig getServletConfig() 
	{ 
		return null;
	}
	@Override
	public String getServletInfo() 
	{ 
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException 
	{ 
		
	}
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1><center>Hello World</center></h1>");
		
	}
	 
}
