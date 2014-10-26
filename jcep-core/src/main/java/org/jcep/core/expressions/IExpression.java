package org.jcep.core.expressions;

import java.io.Serializable;

public interface IExpression <TInput, TOutput> extends Serializable {
	TOutput execute(TInput input);
}