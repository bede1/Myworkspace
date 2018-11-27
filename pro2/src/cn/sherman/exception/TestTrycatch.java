package cn.sherman.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  ≤‚ ‘try catch
 * @author Auser
 *
 */
public class TestTrycatch {
	public static void main(String[]args) {
		FileReader reader ;
		try {
		reader = new FileReader("f:/testjava/tes1.txt");
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
