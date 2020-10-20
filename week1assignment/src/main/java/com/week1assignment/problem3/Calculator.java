package com.week1assignment.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the choice "+"\n"+"1. Perform tan"+"\n"+"2. Perform cos"+"\n"+"3. Perform log"
				+"\n"+"4. Perform sin"+"\n"+"5. Perform Square Root"+"\n"+"6. Perform Cube Root");
		int choice=Integer.parseInt(br.readLine());
		ScientificCalculator obj=new ScientificCalculator();
		switch(choice) {
		case 1:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateTan(Double.parseDouble(br.readLine())));
			break;
		case 2:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateCos(Double.parseDouble(br.readLine())));
			break;
		case 3:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateLog(Double.parseDouble(br.readLine())));
			break;
		case 4:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateSin(Double.parseDouble(br.readLine())));
			break;
		case 5:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateSquareRoot(Double.parseDouble(br.readLine())));
			break;
		case 6:
			System.out.println("Enter value");
			System.out.printf("%.3f",obj.calculateCubeRoot(Double.parseDouble(br.readLine())));
			break;
		}

	}

}
