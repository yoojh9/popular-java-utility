package yjh.utility.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class ListFiles {

	public static void main(String[] args) {
		
		File file = new File("files");
		Collection<File> fileList = FileUtils.listFiles(file, new String[] {"txt"} , true);
		System.out.println(fileList.toString());

	}

}
