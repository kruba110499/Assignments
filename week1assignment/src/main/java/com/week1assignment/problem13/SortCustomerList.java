package com.week1assignment.problem13;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Customer{
	String firstName;
	String lastName;
	int age;
	Customer(String firstName,String lastName, int age){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
}
class SortByName implements Comparator<Customer>{

	public int compare(Customer obj1, Customer obj2) {
		int value=obj1.getFirstName().compareTo(obj2.getFirstName());
		if(value!=0) {
			return value;        
		}
		
		return obj1.getAge() - obj2.getAge();
	}
	
}
class SortByAge implements Comparator<Customer>{

	public int compare(Customer obj1, Customer obj2) {
		return obj1.getAge() - obj2.getAge();
	}
	
}
public class SortCustomerList {
    
	public static void main(String[] args) {
		
		List<Customer> list=new ArrayList<Customer>();
        addValues(list);
        sortByName(list);
        printList(list);
        sortByAge(list);
        printList(list);
	}

	private static void printList(List<Customer> list) {
		for(Customer value:list) {
			System.out.println(value.getFirstName()+" "+value.getLastName()+" "+value.getAge());
			
		}
		System.out.println();
	}

	private static void sortByName(List<Customer> list) {
		Collections.sort(list,new SortByName());
		System.out.println("// Sorting by Name// ");
		
	}
	
	private static void sortByAge(List<Customer> list) {
		
		Collections.sort(list,new SortByAge());
		System.out.println("// Sorting by age //");
		
	}

	private static void addValues(List<Customer> list) {
		
		list.add(new Customer("Mohan","kumar",19));
		list.add(new Customer("Arun","kumar",20));
		list.add(new Customer("Arun","Prasath",18));
		list.add(new Customer("Bala","kumar",25));
	}

}
