package yjh.utility.apache.commons.lang.StringUtils;

import org.apache.commons.lang3.StringUtils;

public class Split {

	public static void main(String[] args) {
		String yjh = "Jeong|hyun|Yoo";
		String[] yjhName = StringUtils.split(yjh,"|");
		
		for(String name : yjhName){
			System.out.println(name);
		}
		
	}

}
