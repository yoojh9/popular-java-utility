package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class IsEmpty {

	public static void main(String[] args) {
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty(" "));	// false
		System.out.println(StringUtils.isEmpty("정현"));

	}

}
