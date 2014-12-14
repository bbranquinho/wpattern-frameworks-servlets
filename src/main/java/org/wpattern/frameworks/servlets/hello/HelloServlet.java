package org.wpattern.frameworks.servlets.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 201402030750L;

	private static final Logger LOGGER = Logger.getLogger(HelloServlet.class);

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Hello servlet called.");

		PrintWriter output = response.getWriter();

		output.println("<html>");
		output.println("   <head>");
		output.println("      <title>Hello Servlet Title</title>");
		output.println("   </head>");
		output.println("   <body>");
		output.println("      Hello Servlet.");
		output.println("   </body>");
		output.println("</html>");
	}

}
