package yjh.utility.apache.commons.io.FilenameUtils;

import org.apache.commons.io.FilenameUtils;

public class WildCardMatch {

	public static void main(String[] args) {
		
		String path = "C:/Users/yjh/Desktop/cat.jpg";
		System.out.println(FilenameUtils.wildcardMatch(path, "*.jpg"));	// true

	}

}
