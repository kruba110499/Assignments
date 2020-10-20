package com.week1assignment.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the choice "+"\n"+"1. INR to USD"+"\n"+"2. USD to INR"+"\n"+"3. INR to EURO"
				+"\n"+"4. EURO to INR"+"\n"+"5. USD to EURO"+"\n"+"6. EURO to USD");
		int choice=Integer.parseInt(br.readLine());
		Convertor obj=new Convertor();
		switch(choice) {
		case 1:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertINRtoUSD(Double.parseDouble(br.readLine())));
			break;
		case 2:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertUSDtoINR(Double.parseDouble(br.readLine())));
			break;
		case 3:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertINRtoEURO(Double.parseDouble(br.readLine())));
			break;
		case 4:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertEUROtoINR(Double.parseDouble(br.readLine())));
			break;
		case 5:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertUSDtoEURO(Double.parseDouble(br.readLine())));
			break;
		case 6:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.convertEUROtoUSD(Double.parseDouble(br.readLine())));
			break;
		}
		

	}

}
