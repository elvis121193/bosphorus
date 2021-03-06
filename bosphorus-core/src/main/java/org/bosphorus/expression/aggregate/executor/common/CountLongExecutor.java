package org.bosphorus.expression.aggregate.executor.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class CountLongExecutor implements IAggregateExecutor<Object, Long> {
	private Long value;

	public CountLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Object input) throws Exception {
		if(input != null) {
			value++;
		}
	}

	@Override
	public Long getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0L;
	}

	@Override
	public Object getState() {
		return this.value;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.value = (Long)state;
	}
}
