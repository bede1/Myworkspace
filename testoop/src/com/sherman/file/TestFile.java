package com.sherman.file;

import java.io.File;

/**
 * ��������
 * 1.·���ָ���
 * 2.�ļ��ָ�����windowϵͳ��
 * @author pc
 *
 */
public class TestFile {
	public static void main(String args[]) {
		System.out.println(File.pathSeparator);  
		System.out.println(File.separator);    //·���ָ���  ������ƽ̨
		String path = "E:"+File.separator+"XP"+File.separator+"test"+File.separator+"2.jpg";  //��separator������ƽ̨
		System.out.println(path);
	}
}
