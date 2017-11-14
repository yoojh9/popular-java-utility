package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class Write {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("foo.txt");
			FileOutputStream output = new FileOutputStream("foo-write.txt");
			byte[] data = IOUtils.toByteArray(in);
			
			IOUtils.write(data, output);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
