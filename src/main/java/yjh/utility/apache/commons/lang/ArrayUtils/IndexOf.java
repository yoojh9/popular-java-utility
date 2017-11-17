package yjh.utility.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

public class IndexOf {

	public static void main(String[] args) {
		
		String[] arr = {"yoo", "jeong", "hyun", "kwon", "yong"};
		
		System.out.println(ArrayUtils.indexOf(arr, "jeong"));	// 1
		System.out.println(ArrayUtils.indexOf(arr, "yong"));	// 4
		System.out.println(ArrayUtils.indexOf(arr, "jung"));	// -1
		
	}

}
