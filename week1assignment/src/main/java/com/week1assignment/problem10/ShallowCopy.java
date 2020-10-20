package com.week1assignment.problem10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class ShallowCopy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int index;
		
		HashMap<Integer, Employee> map=new HashMap<Integer,Employee>();
		for(index=0;index<3;index++) {
			
			map.put(Integer.parseInt(br.readLine()),new Employee(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()), br.readLine()));
		}
		
		HashMap<Integer,Employee> mapCopy=  new HashMap<Integer,Employee>();
		mapCopy=(HashMap<Integer, Employee>) map.clone();
			
		mapCopy.get(1).setAge(20);
		mapCopy.get(1).setName("arun");
		for(Entry<Integer, Employee> keys:map.entrySet()) {
			System.out.println(keys.getKey()+" "+keys.getValue().getId()+" "+keys.getValue().getAge()+" "+keys.getValue().getName());
		}
	    

	}

}
