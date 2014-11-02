package org.bosphorus.aggregation.bag;

import java.util.ArrayList;

import org.bosphorus.expression.IExpression;

public class CountDistinctBag<TInput, TType extends Comparable<TType>> extends BaseAggregationBag<TInput, Integer, TType> {
	private ArrayList<TType> list;

	public CountDistinctBag(IExpression<TInput, TType> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		TType value = this.getExpression().execute(input);
		if(!list.contains(value)) {
			list.add(value);
		}
	}

	@Override
	public Integer getValue() {
		return list.size();
	}

	@Override
	public void reset() {
		list = new ArrayList<TType>();
	}

}
