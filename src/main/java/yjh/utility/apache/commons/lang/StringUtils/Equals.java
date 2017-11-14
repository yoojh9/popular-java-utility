package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class Equals {

	public static void main(String[] args) {
		System.out.println(StringUtils.equals(null, null)); 	// true
		System.out.println(StringUtils.equals("abc","abc"));	// true
		System.out.println(StringUtils.equals("abc","ABC"));	// false
	}

}
