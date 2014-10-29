package org.bosphorus.expression.string;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class StrIndexOf implements IExpression<Integer> {
	
	private IExpression<String> text;
	private IExpression<String> searchString;

	@Override
	public Integer execute(ITuple input) throws Exception {
		return text.execute(input).indexOf(searchString.execute(input));
	}

}