package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WriteStringToFile {

	public static void main(String[] args) {
		
		File file = new File("files/foo-write2.txt");
		
		try {
			String str = "FileUtils writeStringToFile() 테스트";
			FileUtils.writeStringToFile(file, str, "UTF-8");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
