package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class Replace {

	public static void main(String[] args) {
		String text = "YooJeonghyun";
		System.out.println(StringUtils.replace(text, "o","O")); 			// YOOJeOnghyun
		System.out.println(StringUtils.replace(text, "y","")); 				// YooJeonghun
		System.out.println(StringUtils.replace(text, "Yoo","YOO")); 		//YOOJeonghyun
		System.out.println(StringUtils.replaceIgnoreCase(text, "yoo",""));	// Jeonghyun

		
		
	}

}
