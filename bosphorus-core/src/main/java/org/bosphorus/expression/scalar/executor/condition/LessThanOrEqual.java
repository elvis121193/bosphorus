package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class LessThanOrEqual<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {

	public LessThanOrEqual(IScalarExecutor<TInput, TType> left, IScalarExecutor<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}