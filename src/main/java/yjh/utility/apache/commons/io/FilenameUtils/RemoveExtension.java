package yjh.utility.apache.commons.io.FilenameUtils;

import org.apache.commons.io.FilenameUtils;

public class RemoveExtension {

	public static void main(String[] args) {
		
		String path = "C:/Users/yjh/Desktop/cat.jpg";
		System.out.println(FilenameUtils.removeExtension(path));	// C:/Users/yjh/Desktop/cat

	}

}
