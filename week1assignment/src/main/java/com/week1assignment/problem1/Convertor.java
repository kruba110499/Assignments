package com.week1assignment.problem1;

public class Convertor {
    public double convertINRtoUSD(double value) {
		
		return value*0.0136924;
	}

	public double convertUSDtoINR(double value) {
		
		return value*73.0330 ;
	}

	public double convertINRtoEURO(double value) {
		
		return value*0.0115753;
	}

	public double convertEUROtoINR(double value) {
		
		return value*86.3908;
	}

	public double convertUSDtoEURO(double value) {
		
		return value*0.845380;
	}

	public double convertEUROtoUSD(double value) {
		return value*1.18290;
	}
}
