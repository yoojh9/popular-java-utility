package yjh.utility.apache.commons.io.IOUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.io.IOUtils;

public class CloseQuietly {

	public static void main(String[] args) {
		
		Reader in = null;
		
		try {
			in = new FileReader("files/foo.txt");
			int data = -1;
			
			while((data = in.read()) != -1){
				System.out.print((char)data);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(in);
		}

	}

}
