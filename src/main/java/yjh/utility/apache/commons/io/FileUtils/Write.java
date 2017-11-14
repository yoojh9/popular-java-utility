package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Write {

	public static void main(String[] args) {
		
		File file = new File("files/foo-write3.txt");
		
		try {
			String data = "FileUtils write() 테스트";
			FileUtils.write(file, data, "UTF-8");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
