package com.assignment.problem21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D:/file.txt");
        BufferedReader input=new BufferedReader(reader);
        String str=input.readLine();
        String newString=str.substring(0, 4)+"are "+str.substring(4);
        input.close();
        FileWriter writer=new FileWriter("D:/file.txt");
        writer.write(newString);
        writer.close();
	}

}
