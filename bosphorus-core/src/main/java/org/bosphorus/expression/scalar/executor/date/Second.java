package org.bosphorus.expression.scalar.executor.date;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class Second<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<TInput, Date> value;
	
	public Second(IScalarExecutor<TInput, Date> value) {
		this.value = value;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).getSeconds();
	}

}
