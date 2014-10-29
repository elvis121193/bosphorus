package org.bosphorus.expression.math;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AddInteger extends BaseBinaryOperator<Integer> {

	public AddInteger(IExpression<Integer> left,
			IExpression<Integer> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Integer execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}