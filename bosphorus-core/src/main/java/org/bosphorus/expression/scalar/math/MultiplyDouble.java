package org.bosphorus.expression.scalar.math;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class MultiplyDouble<TInput> implements IScalarExecutor<TInput, Double> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public MultiplyDouble(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Double execute(TInput input) throws Exception {
		return left.execute(input).doubleValue() * right.execute(input).doubleValue();
	}

}
