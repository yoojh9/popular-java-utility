package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ForceMkdir {

	public static void main(String[] args) {
		
		File file = new File("files/fileutils");
		
		try {
			FileUtils.forceMkdir(file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
