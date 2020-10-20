package com.week1assignment.problem15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
	    int length=0;
	    addValues(list);
		length=calculateLength(list);
	    sort(list,length);
		printList(list);
	}
	public static void printList(List<String> list) {
		for(String str:list) {
			System.out.println(str);
		}
	}
	public static void sort(List<String> list,int length) {
		Collections.sort(list.subList(0, length));
		Collections.sort(list.subList(length, list.size()),Collections.reverseOrder());
	}
	public static int calculateLength(List<String> list) {
		
		return list.size()/2;
	}
	public static void addValues(List<String> list) {
		list.add("Manoj");
		list.add("Hello");
		list.add("Ramu");
		list.add("Krishna");
		list.add("Hema");
		list.add("Anu");
	
	}

}
