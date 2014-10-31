package org.bosphorus.stream.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.IStreamReader;

public class LeftJoin<TInput> extends BaseJoin<TInput> {

	public LeftJoin(IStreamReader<List<TInput>> left,
			IStreamReader<TInput> right,
			IExpression<List<TInput>, Boolean> expression) {
		super(left, right, expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<List<TInput>> readAll() throws Exception {
		List<List<TInput>> left = this.getLeft().readAll();
		List<TInput> right = this.getRight().readAll();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(List<TInput> leftRow: left) {
			Boolean found = false;
			for(TInput rightRow: right) {
				ArrayList<TInput> row = new ArrayList<TInput>(leftRow);
				row.add(rightRow);
				if(this.getExpression().execute(row)) {
					result.add(row);
					found = true;
				}
			}
			if(!found) {
				ArrayList<TInput> row = new ArrayList<TInput>(leftRow);
				row.add(null);
				result.add(row);
			}
		}
		return result;
	}

}