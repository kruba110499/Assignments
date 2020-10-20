package com.assignment.problem27;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1;
		String str2;
		str1=scan.nextLine().replaceAll(" ", "");
		str2=scan.nextLine().replaceAll(" ", "");
        boolean bool=checkAnagram(str1,str2);
        
        if(bool) {
        	System.out.println("Strings arre anagrams");
        }
        else
        	System.out.println("not anagrams");
	}

	public static boolean checkAnagram(String str1, String str2) {
		Set<Character> set=new HashSet<>();
		char[] chararr=str1.toCharArray();
		char[] chararr1=str2.toCharArray();
		for(Character c:chararr) {
			set.add(c);
		}
		for(Character val:chararr1) {
			if(set.add(val)) {
				return false;
			}
	}
		return true;
	}

}
