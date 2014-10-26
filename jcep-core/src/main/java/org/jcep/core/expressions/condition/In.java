package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public class In<TInput, TOutput extends Comparable<TOutput>> extends BaseListComparison<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 326293447079841977L;

	public In(IExpression<TInput, TOutput> value,
			ArrayList<IExpression<TInput, TOutput>> list) {
		super(value, list);
	}

	@Override
	public Boolean execute(TInput input) {
		TOutput value = this.getValue().execute(input);
		for(IExpression<TInput, TOutput> expr: this.getList()) {
			if(value.equals(expr.execute(input))) {
				return true;
			}
		}
		return false;
	}

}
