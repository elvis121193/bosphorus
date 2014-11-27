package org.bosphorus.expression.scalar.executor.date;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class TruncateToHour<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<TInput, Date> expression;
	
	public TruncateToHour(IScalarExecutor<TInput, Date> expression) {
		this.expression = expression;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Date execute(TInput input) throws Exception {
		Date date = expression.execute(input);
		return new Date(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), 0);
	}
}
