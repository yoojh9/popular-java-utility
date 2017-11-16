package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class Join {

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		
		System.out.println(StringUtils.join(arr,"")); 	// abc
		System.out.println(StringUtils.join(arr,","));	// a,b,c

	}

}
