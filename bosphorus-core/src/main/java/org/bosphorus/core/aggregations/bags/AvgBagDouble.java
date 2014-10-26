package org.bosphorus.core.aggregations.bags;

public class AvgBagDouble implements IAggregationBag<Double, Double> {
	private Double sum;
	private Integer count;

	@Override
	public void execute(Double value) {
		this.sum += value;
		this.count++;
	}

	@Override
	public Double value() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return 0.0;
	}

}
