package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class Copy {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("foo.txt");
			FileOutputStream out = new FileOutputStream("foo-copy.txt");
			
			IOUtils.copy(in, out);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
