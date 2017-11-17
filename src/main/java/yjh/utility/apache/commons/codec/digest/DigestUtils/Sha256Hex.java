package yjh.utility.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256Hex {

	public static void main(String[] args) {
		File file = new File("files/foo.txt");
		
		try {
			InputStream is = new FileInputStream(file);
			
			String digest = DigestUtils.sha256Hex(is);
			System.out.println("Digest_MD5="+digest);
			System.out.println("Digest_MD5_length="+digest.length());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
