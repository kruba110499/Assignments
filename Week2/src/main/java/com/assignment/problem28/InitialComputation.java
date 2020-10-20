package com.assignment.problem28;

import java.util.Scanner;

public class InitialComputation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name;
		int index;
		int length;
		name=scan.nextLine();
		length=name.length();
		StringBuilder initial=new StringBuilder();
		initial.append(name.charAt(0));
		for(index=0;index<length;index++) {
			if((name.charAt(index)==' ') && (name.charAt(index+1)<length)) {
				initial.append(name.charAt(index+1));
			}
		}
		System.out.println(initial.toString().toUpperCase());

	}

}
