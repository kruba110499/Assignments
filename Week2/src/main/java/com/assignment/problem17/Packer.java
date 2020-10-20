package com.assignment.problem17;

import java.util.concurrent.Exchanger;

public class Packer implements Runnable{
	int amount;
    Exchanger ex;
    Packer(Exchanger ex){
    	this.ex=ex;
    }
	
	public void run() {
		try {
			ex.exchange(0);
			System.out.println("box is packed");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
