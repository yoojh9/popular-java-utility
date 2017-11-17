package yjh.utility.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

public class SubArray {

	public static void main(String[] args) {
		
		String[] arr = {"yoo", "jeong", "hyun", "kwon", "yong"};
		String[] result = null;
		
		result = ArrayUtils.subarray(arr, 1, 5);
	
		for(String str : result){
			System.out.println(str);
		}
		
	}

}
