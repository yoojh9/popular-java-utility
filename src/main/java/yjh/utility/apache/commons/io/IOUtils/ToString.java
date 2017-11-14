package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class ToString {

	public static void main(String[] args) {
		
		try {
			FileReader in = new FileReader("files/foo.txt");
			String input = IOUtils.toString(in);
			System.out.println(input);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
