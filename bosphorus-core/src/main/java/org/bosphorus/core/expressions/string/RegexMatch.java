package org.bosphorus.core.expressions.string;

import java.util.regex.Pattern;

import org.bosphorus.core.expressions.IExpression;

public class RegexMatch<TInput> implements IExpression<TInput, Boolean> {

	private IExpression<TInput, String> pattern;
	private IExpression<TInput, String> text;
	
	@Override
	public Boolean execute(TInput input) throws Exception {
		Pattern p = Pattern.compile(pattern.execute(input));
		return p.matcher(text.execute(input)).matches();
	}

}
