package com.sherman.testfile;

import java.io.File;

/**
 * ����·���ָ���
 * @author Auser
 *
 */
public class testFile01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//·����ʾ��ʽ
		String path = "E:\\testfile\\test\\1.jpg";
		String path2 = "E:"+File.separator+"testfile"+File.separator+"test"+File.separator+"2.jpg";
		File file  = new File(path);
		File file2 = new File(path2);
		System.out.println(file);
		System.out.println(file2);
	}
}
