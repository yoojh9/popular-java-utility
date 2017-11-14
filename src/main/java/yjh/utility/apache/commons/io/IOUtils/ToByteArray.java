package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class ToByteArray {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("files/foo.txt");
			byte[] byteArr = IOUtils.toByteArray(in);
			System.out.println(byteArr.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
