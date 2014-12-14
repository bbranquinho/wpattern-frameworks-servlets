package org.wpattern.frameworks.servlets.servlets3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(urlPatterns = {"/hello3", "/servlet3"})
public class HelloServlet3 extends HttpServlet {

	private static final long serialVersionUID = 201402030750L;

	private static final Logger LOGGER = Logger.getLogger(HelloServlet3.class);

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Hello servlet 3.0 called.");

		PrintWriter output = response.getWriter();

		output.println("<html>");
		output.println("   <head>");
		output.println("      <title>Hello Servlet 3.0 Title</title>");
		output.println("   </head>");
		output.println("   <body>");
		output.println("      Hello Servlet 3.0.");
		output.println("   </body>");
		output.println("</html>");
	}

}

