package com.sherman.testfile;

import java.io.UnsupportedEncodingException;

/**
 *  ����ת�������ַ�ת�ֽ�
 *  2.�����ԭ��
	1�������������ַ�����ͳһ
	2���ֽ�ȱ�٣����ȶ�ʧ
 *  
 * @author Auser
 *
 */
public class testConverse01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�ɶ�,sherman";  //Ĭ��GBK
		byte[] data = str.getBytes();  //���� charתbyte
		System.out.println(new String(data));
		byte[] data2 = str.getBytes("utf-8");  //uft-8,��������
		System.out.println(new String(data2));
		System.out.println("###################");
		String str2 = new String(data2,"utf-8");   //ʹ��utf-8����
		System.out.println(new String(str2));
		byte[] data3 = str2.getBytes("utf-8");
		System.out.println(new String(data3,"utf-8"));
		
		
		
	}
}