package com.sherman.testfile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * ���Դ�ӡ��
 * @author pc
 *
 */
public class testPrintStream01 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("testprint");
		PrintStream ps = System.out;
		ps.println("test123");
		//������ļ�
		File src = new File("D:\\testio\\testprint.txt");
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.println("sherman is learning java.io.");
		ps.print("this is new line, ");
		ps.print("go on to print");
		ps.close();
		
		
		
	}
}