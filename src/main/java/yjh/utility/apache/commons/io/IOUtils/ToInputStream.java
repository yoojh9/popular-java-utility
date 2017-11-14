package yjh.utility.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class ToInputStream {

	public static void main(String[] args) {
		
		String str = "안녕하세요. toInputStream 테스트";
		
		try {
			InputStream input = IOUtils.toInputStream(str,"UTF-8");
			
			// 확인용
			System.out.println(IOUtils.toString(input,"UTF-8"));
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
