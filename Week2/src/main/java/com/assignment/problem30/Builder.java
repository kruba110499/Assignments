package com.assignment.problem30;

public class Builder implements Runnable{
	StringBuilder builder = new StringBuilder();
	int ctr;
	@Override
	public void run() {
		System.out.print("Builder ");
		for(ctr=0;ctr<5;ctr++) {
			builder.append(ctr);
			
		}
		System.out.println(builder);
	}
}
