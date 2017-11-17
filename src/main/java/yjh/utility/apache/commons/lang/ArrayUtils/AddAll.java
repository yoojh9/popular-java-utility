package yjh.utility.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

public class AddAll {

	public static void main(String[] args) {
		
		String[] arr1 = {"yoo", "jeong", "hyun"};
		String[] arr2 = {"kwon", "yong"};
		String[] result = null;
		
		result = ArrayUtils.addAll(arr1, arr2);
	
		for(String str : result){
			System.out.println(str);
		}
		
	}

}
