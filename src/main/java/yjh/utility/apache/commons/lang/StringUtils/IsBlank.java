package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class IsBlank {

	public static void main(String[] args) {
		System.out.println(StringUtils.isBlank(null));
		System.out.println(StringUtils.isBlank(""));
		System.out.println(StringUtils.isBlank(" "));	// true
		System.out.println(StringUtils.isBlank("정현"));

	}

}
