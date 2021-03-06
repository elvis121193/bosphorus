package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IIfExecutor<TInput, TOutput> implements IScalarExecutor<TInput, TOutput> {
	
	private IScalarExecutor<TInput, Boolean> condition;
	private IScalarExecutor<TInput, ? extends TOutput> trueValue;
	private IScalarExecutor<TInput, ? extends TOutput> falseValue;
	
	public IIfExecutor(IScalarExecutor<TInput, Boolean> condition, IScalarExecutor<TInput, ? extends TOutput> trueValue, IScalarExecutor<TInput, ? extends TOutput> falseValue) {
		this.condition = condition;
		this.trueValue = trueValue;
		this.falseValue = falseValue;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		return condition.execute(input) ? trueValue.execute(input) : falseValue.execute(input);
	}

}
