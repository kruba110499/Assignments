package com.assignment.problem30;

public class Buffer implements Runnable{
	StringBuffer buffer = new StringBuffer();
	int ctr;
	public void run() {
		 
		System.out.print("Buffer ");
		for(ctr=0;ctr<5;ctr++) {
			buffer.append(ctr);
			
		}
		System.out.println(buffer);
		
	}
}
