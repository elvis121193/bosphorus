package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class Not extends BaseUnaryCondition<Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2303076151421970778L;

	public Not(IExpression<Boolean> value) {
		super(value);
	}

	@Override
	public Boolean execute(ITuple input) throws Exception {
		return !this.getValue().execute(input);
	}

}