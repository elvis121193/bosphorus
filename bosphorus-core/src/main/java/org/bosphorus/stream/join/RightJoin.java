package org.bosphorus.stream.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.IStreamReader;

public class RightJoin<TInput> extends BaseJoin<TInput> {

	public RightJoin(IStreamReader<List<TInput>> left,
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
		for(TInput rightRow: right) {
			Boolean found = false;
			for(List<TInput> leftRow: left) {
				ArrayList<TInput> row = new ArrayList<TInput>(leftRow);
				row.add(rightRow);
				if(this.getExpression().execute(row)) {
					result.add(row);
					found = true;
				}
			}
			if(!found) {
				ArrayList<TInput> row = new ArrayList<TInput>();
				for(List<TInput> leftRow: left) {
					leftRow.add(null);
				}
				row.add(rightRow);
				result.add(row);
			}
		}
		return result;
	}

}
