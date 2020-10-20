package com.week1assignment.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaxCalculation {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		double salary;
		String gender;
        double tax_amount;
		System.out.println("Enter the yearly salary of the Employee and gender");
		salary=Double.parseDouble(br.readLine());
		gender=br.readLine();
		tax_amount=calculateTax(salary);
		if(gender.equals("male"))
		 System.out.printf("%.2f",tax_amount);
		else if(gender.equals("female"))
			System.out.printf("%.2f",(tax_amount-2000));
		
	}
    public static double calculateTax(double salary) {
    	if(salary<150000) {
    		return 0;
    	}
    	else if(salary>=150000 && salary<1000000) {
    		return ((salary*10)/100);
    	}
    	else if(salary>=1000000 && salary<1500000) {
    		return ((salary*20)/100);
    	}
    	else if(salary>=1500000 && salary<3000000) {
    		return ((salary*35)/100);
    	}
    	else if(salary>4000000) {
    		return ((salary*40)/100);
    	}
    	return 0;
    }
}
