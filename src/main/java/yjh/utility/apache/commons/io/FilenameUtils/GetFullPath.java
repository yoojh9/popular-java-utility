package yjh.utility.apache.commons.io.FilenameUtils;

import org.apache.commons.io.FilenameUtils;

public class GetFullPath {

	public static void main(String[] args) {
		
		String path = "C:/Users/yjh/Desktop/cat.jpg";
		System.out.println(FilenameUtils.getFullPath(path));	// jpg

	}

}
