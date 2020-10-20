package com.assignment.problem26;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		String message;
		Scanner scan=new Scanner(System.in);
		message=scan.nextLine();
		boolean bool=checkUnique(message);
		if(bool) {
			System.out.println("String charaters are unique");
		}
		else
			System.out.println("String characters are not unique");

	}

	private static boolean checkUnique(String message) {
		Set<Character> set=new HashSet<Character>();
		char[] chararr=message.toCharArray();
		for(Character val:chararr) {
			if(!set.add(val)) {
				return false;
			}
		}
		return false;
	}

}
