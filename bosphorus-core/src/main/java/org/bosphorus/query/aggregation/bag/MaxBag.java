package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class MaxBag<TOutput extends Comparable<TOutput>> extends BaseAggregationBag<TOutput, TOutput> {
	private TOutput value;
	
	public MaxBag(IExpression<TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(ITuple input) throws Exception {
		TOutput expr = this.getExpression().execute(input);
		if(this.value == null || this.value.compareTo(expr) < 0) {
			this.value = expr;
		}
	}

	@Override
	public TOutput getValue() {
		return this.value;
	}

}