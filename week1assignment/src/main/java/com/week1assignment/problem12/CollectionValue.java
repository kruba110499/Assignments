package com.week1assignment.problem12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class CollectionValue {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		
		int size=Integer.parseInt(br.readLine());
		Map<Integer,String> map=new HashMap<Integer,String>();
		addValues(map,size);
		print(map);
		
	}

	private static void print(Map<Integer, String> map) {
		System.out.println("Collection view of values is "+map.values());
		
	}

	private static void addValues(Map<Integer, String> map, int size) throws Exception {
		int index;
		int key;
		String value;
		for(index=0;index<size;index++) {
			key=Integer.parseInt(br.readLine());
			value=br.readLine();
			map.put(key, value);
		}
		
	}
	
	
}
