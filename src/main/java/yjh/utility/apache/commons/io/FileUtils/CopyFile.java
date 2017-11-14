package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFile {

	public static void main(String[] args) {
		
		File srcFile = new File("foo.txt");
		
		try {
			File destFile = new File("foo-dest.txt");
			FileUtils.copyFile(srcFile, destFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
