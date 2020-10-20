package com.assignment.problem24;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		Properties property=new Properties();
		FileReader file=new FileReader("details.properties");
		property.load(file);
		System.out.println(property.getProperty("user"));

	}

}
