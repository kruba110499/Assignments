package com.week1assignment.problem11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ContainsMapping {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int index;
		int key;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(index=0;index<3;index++) {
			map.put(Integer.parseInt(br.readLine()),br.readLine());
		}
        System.out.println("Enter the key to be checked");
        key=Integer.parseInt(br.readLine());
        if(map.containsKey(key)) {
        	System.out.println(map.get(key));
        }
        else {
        	System.out.println("Key not present");
        }
        
	}

}
