package com.assignment.problem29;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String message;
		message=scan.nextLine();
		System.out.println(removeDuplicates(message));
	}

	public static String removeDuplicates(String message) {
		int index;
		int index1;
		int temp=1;
		String output="";
		char[] arr=message.toCharArray();
		int length=arr.length;
		for(index=0;index<length;index++) {
			int count=0;
			for(index1=0;index1<temp;index1++) {
				if(arr[index]==arr[index1])
					count++;
			}
			if(count==0) {
				arr[temp++]=arr[index];
			}
		}
		for(index=temp;index<length;index++) {
			arr[index]='\n';
		}
		for(index=0;index<temp;index++) {
			output=output+arr[index];
		}
		return output;
	}

}
