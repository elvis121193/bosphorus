package org.bosphorus.core.expressions.math;

import org.bosphorus.core.expressions.IExpression;

public class AddInteger<TInput> extends BaseBinaryOperator<TInput, Integer> {

	public AddInteger(IExpression<TInput, Integer> left,
			IExpression<TInput, Integer> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Integer execute(TInput input) throws Exception {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}