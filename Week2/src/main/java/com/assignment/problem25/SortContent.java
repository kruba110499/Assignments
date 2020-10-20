package com.assignment.problem25;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortContent {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D:/file.txt");
		BufferedReader input=new BufferedReader(reader);
		List<String> list=new ArrayList<String>();
		String str;
		while((str=input.readLine())!=null) {
			list.add(str);
		}
		Collections.sort(list);
		FileWriter writer=new FileWriter("D:/file.txt");
		for(String value:list) {
			writer.write(value);
		}
		writer.close();

	}

}
