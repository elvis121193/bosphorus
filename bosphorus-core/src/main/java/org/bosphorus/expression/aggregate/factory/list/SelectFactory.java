package org.bosphorus.expression.aggregate.factory.list;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.list.SelectExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class SelectFactory<TType> implements IAggregateExecutorFactory<TType, List<TType>> {

	@Override
	public IAggregateExecutor<TType, List<TType>> create() {
		return new SelectExecutor<TType>();
	}

}
