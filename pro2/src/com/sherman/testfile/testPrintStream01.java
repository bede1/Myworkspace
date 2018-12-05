package com.sherman.testfile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 测试打印流
 * @author pc
 *
 */
public class testPrintStream01 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("testprint");
		PrintStream ps = System.out;
		ps.println("test123");
		//输出到文件
		File src = new File("D:\\testio\\testprint.txt");
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src,true)));  //true在原有文件后继续添加
		ps.println("\n"+"sherman is learning java.io.");
		ps.println("this is new line, ");
		ps.println("go on to print");
		ps.flush();
		ps.close();
		
		
		
	}
}
