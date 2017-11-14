package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadFileToString {

	public static void main(String[] args) {
		
		File file = new File("foo.txt");
		
		try {
			String str = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
