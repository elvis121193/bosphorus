package org.bosphorus.builder.expression.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.AndExecutor;

public class AndBuilder<TInput> extends BaseConditionListBuilder<TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String getOperator() {
		return "and";
	}

	@Override
	protected IScalarExecutor<TInput, Boolean> build(
			IScalarExecutor<TInput, Boolean> left,
			IScalarExecutor<TInput, Boolean> right) {
		return new AndExecutor<TInput>(left, right);
	}

}
