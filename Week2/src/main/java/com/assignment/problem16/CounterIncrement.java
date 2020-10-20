package com.assignment.problem16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Counter implements Runnable{
	String name;
	Counter(String name){
		this.name=name;
	}
	public void run() {
		int counter=0;
		for(int index=0;index<1000000;index++) {
			counter=counter+index;
		}
		System.out.println(name+" "+counter);
	}
}
public class CounterIncrement {

	public static void main(String[] args) {
	  Runnable thread1=new Counter("thread1");
	  Runnable thread2=new Counter("thread2");
	  Runnable thread3=new Counter("thread3");
	  Runnable thread4=new Counter("thread4");
	  ExecutorService pool=Executors.newFixedThreadPool(2);
	  pool.execute(thread1);
	  pool.execute(thread2);
	  pool.execute(thread3);
	  pool.execute(thread4);
	}

}
