package yjh.utility.apache.commons.io.FilenameUtils;

import org.apache.commons.io.FilenameUtils;

public class IsExtension {

	public static void main(String[] args) {
		
		String path = "C:/Users/yjh/Desktop/cat.jpg";
		System.out.println(FilenameUtils.isExtension(path, "gif"));	// false
		System.out.println(FilenameUtils.isExtension(path, "JPG"));	// false
		System.out.println(FilenameUtils.isExtension(path, "jpg"));	// true
		

	}

}
