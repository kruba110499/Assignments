package com.assignment.problem17;

import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class ExchangeProgram {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		Exchanger ex=new Exchanger();
		int totalamount=scan.nextInt();
		int index;
		for(index=0;index<totalamount;index++) {
			Checker obj=new Checker(ex);
			Packer packer=new Packer(ex);
			Thread t1=new Thread(obj);
			Thread t2=new Thread(packer);
			t1.start();
			t1.join(10);
			t2.start();
			
			
		}

	}

}
