package com.week1assignment.problem14;


import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableSynchronization implements Runnable{
	 static Hashtable<Integer,Integer> hashtable=new Hashtable<Integer,Integer>();
	public static void main(String[] args) throws InterruptedException {
		HashTableSynchronization obj=new HashTableSynchronization();
		 
		Thread t1=new Thread(obj,"thread1");
		Thread t2=new Thread(obj,"thread2");
		Thread t3=new Thread(obj,"thread3");
		t1.start();
		t3.start();
        t2.start();
	}

	 public void run() {
		    hashtable.put(1, 2);
	        hashtable.put(2, 3);
	        hashtable.put(3, 3);
	        hashtable.put(4, 3);
	        hashtable.put(5, 3);

		    System.out.println("Executing"+Thread.currentThread()+" "+hashtable);	
	}


}
