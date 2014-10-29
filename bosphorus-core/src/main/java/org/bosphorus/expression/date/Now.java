package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class Now implements IExpression<Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9102709953893651584L;

	@Override
	public Date execute(ITuple input) {
		return new Date();
	}

}