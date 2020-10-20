package com.assignment.problem17;

import java.util.concurrent.Exchanger;

public class Checker implements Runnable{
    int amount;
    Exchanger ex;
    Checker(Exchanger ex){
    	this.ex=ex;
    }
	
	public void run() {
		int max=10;
		for(int ind=0;ind<max;ind++) {
			amount++;
			if(amount==max) {
				try {
					System.out.println("box is full with "+amount+" bulbs");
					ex.exchange(amount);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
