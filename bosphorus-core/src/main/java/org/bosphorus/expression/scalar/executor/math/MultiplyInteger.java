package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class MultiplyInteger<TInput> implements IScalarExecutor<TInput, Integer> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public MultiplyInteger(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Integer execute(TInput input) throws Exception {
		return left.execute(input).intValue() * right.execute(input).intValue();
	}

}
