package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyDirectory {

	public static void main(String[] args) {
		
		try {
			FileUtils.copyDirectory(new File("files/fileutils"), new File("files/fileutils-copy"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
