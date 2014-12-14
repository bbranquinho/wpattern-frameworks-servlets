package org.wpattern.frameworks.servlets.multiple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class MultipleServlet extends HttpServlet {

	private static final long serialVersionUID = 201402031504L;

	private static final Logger LOGGER = Logger.getLogger(MultipleServlet.class);

	public double parseToDouble(String value) {
		if ((value == null) || value.trim().isEmpty()) {
			return 0.0;
		}

		try {
			return Double.parseDouble(value);
		} catch (NumberFormatException e) {
			LOGGER.error(e.getMessage(), e);
			return 0.0;
		}
	}

	public double multiple(MultipleBean multipleBean) {
		LOGGER.info("Multiple bean = " + multipleBean);

		return multipleBean.getValue1() * multipleBean.getValue2();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.info("Multiple servlet called.");

		MultipleBean multipleBean = new MultipleBean(this.parseToDouble(request.getParameter("value1")),
				this.parseToDouble(request.getParameter("value2")));
		double result = this.multiple(multipleBean);

		PrintWriter output = response.getWriter();

		output.println("<html>");
		output.println("   <head>");
		output.println("      <title>Hello Person</title>");
		output.println("   </head>");
		output.println("   <body>");
		output.println("      " + multipleBean.getValue1() + " * " + multipleBean.getValue2() + " = " + result);
		output.println("   </body>");
		output.println("</html>");
	}

}
