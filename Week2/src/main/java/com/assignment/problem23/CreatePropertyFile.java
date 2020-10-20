package com.assignment.problem23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class CreatePropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scan=new Scanner(System.in);
		Properties property=new Properties();
		for(int ind=0;ind<4;ind++) {
			property.setProperty(scan.next(), scan.next());
			
		}
		property.store(new FileOutputStream("details.properties"), null);
		

	}

}
