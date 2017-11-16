package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class Trim {

	public static void main(String[] args) {
		String text1 = "     ";
		String text2 = null;
		String text3 = "    abc ";
		
		System.out.println("-- trim --");
		// trim
		System.out.println(StringUtils.trim(text1));	// ""
		System.out.println(StringUtils.trim(text2));	// null
		System.out.println(StringUtils.trim(text3));	// abc
		
		System.out.println("-- trimToNull --");
		// trimToNull
		System.out.println(StringUtils.trimToNull(text1));	// null
		System.out.println(StringUtils.trimToNull(text2));	// null
		System.out.println(StringUtils.trimToNull(text3));	// abc
		
		System.out.println("-- trimToEmpty --");
		// trimToEmpty
		System.out.println(StringUtils.trimToEmpty(text1));	// ""
		System.out.println(StringUtils.trimToEmpty(text2));	// ""
		System.out.println(StringUtils.trimToEmpty(text3));	// abc
		

	}

}
