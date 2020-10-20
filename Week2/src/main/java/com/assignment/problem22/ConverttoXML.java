package com.assignment.problem22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConverttoXML {

	public static void main(String[] args) throws IOException {
		InputStream input=new FileInputStream("details.properties");
		OutputStream output=new FileOutputStream("detail.xml");
		Properties property=new Properties();
		property.load(input);
		property.storeToXML(output, null);
       output.close();
       
	}

}
