package com.week1assignment.problem9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface Payment{
	public void debitCard(double amount);
	public void creditCard(double amount);
	default public void netBanking(double amount) {
	
		System.out.println("Currently netbanking is not supported");
	}
}
class HDFC implements Payment{
	@Override
	public void debitCard(double amount) {
       System.out.println(amount+" transacted succesfully");
	  
	}

	@Override
	public void creditCard(double amount) {
		 System.out.println(amount+" transacted succesfully");
	}

	@Override
	public void netBanking(double amount) {
		 System.out.println(amount+" transacted succesfully");
	}
		
	
}
class SBI implements Payment{
	
	@Override
	public void debitCard(double amount) {
       System.out.println(amount+" transacted succesfully");
	  
	}

	@Override
	public void creditCard(double amount) {
		 System.out.println(amount+" transacted succesfully");
	}
	
	
}
public class Customer {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the bank"+"\n"+"1. HDFC"+"\n"+"2. SBI");
		int bank=Integer.parseInt(br.readLine());
		switch(bank) {
		case 1:
			HDFC obj=new HDFC();
			obj.netBanking(1000);
			break;
		case 2:
			SBI obj1=new SBI();
			obj1.netBanking(1000);
			break;
		}
		

	}

}
