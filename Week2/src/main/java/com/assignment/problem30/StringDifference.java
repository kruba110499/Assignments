package com.assignment.problem30;

public class StringDifference {
	public static void concat1(String s1)
	   {
	       s1 += "world";
	   }
	public static void main(String[] args) {
		String s1 = "Hello";
        concat1(s1);
        System.out.println("String: " + s1);
        Buffer obj = new Buffer();
		Thread thread = new Thread(obj);
		Thread thread3=new Thread(obj);
		thread3.start();
		thread.start();
		
		Builder obj1 = new Builder();
		Thread thread1 = new Thread(obj1);
		thread1.start();
		Thread thread2=new Thread(obj1);
		thread2.start();
		
       
	}

}
