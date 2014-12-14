package org.wpattern.frameworks.servlets.multiple;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MultipleBean {

	private double value1;

	private double value2;

	public MultipleBean() {
	}

	public MultipleBean(double value1, double value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	public double getValue1() {
		return this.value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return this.value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

}
