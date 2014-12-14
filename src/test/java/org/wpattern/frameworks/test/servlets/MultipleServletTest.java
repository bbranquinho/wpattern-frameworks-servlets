package org.wpattern.frameworks.test.servlets;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.wpattern.frameworks.servlets.multiple.MultipleBean;
import org.wpattern.frameworks.servlets.multiple.MultipleServlet;

public class MultipleServletTest {

	private static final Logger LOGGER = Logger.getLogger(MultipleServletTest.class);

	@Test
	public void testMultiple() {
		MultipleServlet servlet = new MultipleServlet();
		MultipleBean multipleBean = new MultipleBean(10.0, 20.0);

		double result = servlet.multiple(multipleBean);

		LOGGER.info("Value = " + result);

		if (result != 200.0) {
			Assert.fail("Wrong value.");
		}
	}

}
