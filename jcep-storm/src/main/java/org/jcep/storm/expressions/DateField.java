package org.jcep.storm.expressions;

import java.util.Date;

import backtype.storm.tuple.Tuple;

public class DateField extends BaseField<Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -189426750884840578L;

	public DateField(String fieldName) {
		super(fieldName);
	}

	@Override
	public Date execute(Tuple context) {
		return (Date)context.getValueByField(this.getFieldName());
	}
	
}