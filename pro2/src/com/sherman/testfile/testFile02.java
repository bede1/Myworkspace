package com.sherman.testfile;

import java.io.File;

/**
 * ���·�������·������ File����
 * 1�����·��
    File(String parent, String child)  ==>File("E:/xp/test","2.jpg")
    File(File parent, String child)     ==> File(new File("E:/xp/test"),"2.jpg")
    2������·��
    File(String name);
 * @author Auser
 *
 */
public class testFile02 {
	public static void main(String[] args) {
		String parentPath = "E:/testfile/test";
		String name = "2.jpg";
		//File �������·���ĵ���
		File src = new File(parentPath,name);  
		File src2 = new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src2.getPath());
		File src3 = new File("E:/xp/test/3.jpg");
		System.out.println(src3.getName());
		System.out.println(src3.getPath());
		//û���̷���������Ŀ����λ�ô���
		File src4 =new File("test.txt");
		
		System.out.println(src4.getName());
		System.out.println(src4.getPath());
		System.out.println(src4.getAbsolutePath());
		
		
	}
	
	
}
