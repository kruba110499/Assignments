package com.week1assignment.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class EmployeeDetails{
	private int id;
	private int salary;
	private String name;
	public EmployeeDetails(int id, int salary, String name) {
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class DataHiding {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int index;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<EmployeeDetails> list=new ArrayList<EmployeeDetails>();
		for(index=0;index<3;index++) {
		list.add(new EmployeeDetails(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),br.readLine()));
		}
		display(list);
	}

	public static void display(List<EmployeeDetails> list) {
		for(EmployeeDetails emp:list) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		}
		
	}

}
