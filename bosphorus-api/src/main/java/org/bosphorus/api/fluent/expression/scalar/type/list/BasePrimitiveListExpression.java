package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.BasePrimitiveExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.IntegerExpression;

public abstract class BasePrimitiveListExpression<TInput, TType extends Comparable<TType>, TPrimitiveType extends BasePrimitiveExpression<TInput, TType>> extends BaseListExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasePrimitiveListExpression(IScalarExpression<TInput, List<? extends TType>> builder) {
		super(builder);
	}
	
	protected abstract TPrimitiveType create(IScalarExpression<TInput, TType> expression);
	
	public IntegerExpression<TInput> length() {
		return null;
	}

}
