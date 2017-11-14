package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class ReadLines {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("foo-readline.txt");
			List<String> text = IOUtils.readLines(in, "UTF-8");

			System.out.println(text);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
