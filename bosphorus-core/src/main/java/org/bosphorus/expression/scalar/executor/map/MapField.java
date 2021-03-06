package org.bosphorus.expression.scalar.executor.map;

import java.util.Map;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class MapField<TOutput> implements IScalarExecutor<Map<String, ?>, TOutput> {
	private String name;

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(Map<String, ?> input) throws Exception {
		return (TOutput)input.get(name);
	}

}
