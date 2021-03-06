package com.sherman.testfile;

import java.io.UnsupportedEncodingException;

/**
 *  测试转换流：字符转字节
 *  2.乱码的原因：
	1）编码与解码的字符集不统一
	2）字节缺少，长度丢失
 *  
 * @author Auser
 *
 */
public class testConverse01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "成都,sherman";  //默认GBK
		byte[] data = str.getBytes();  //编码 char转byte
		System.out.println(new String(data));
		byte[] data2 = str.getBytes("utf-8");  //uft-8,出现乱码
		System.out.println(new String(data2));
		System.out.println("###################");
		String str2 = new String(data2,"utf-8");   //使用utf-8编码
		System.out.println(new String(str2));
		byte[] data3 = str2.getBytes("utf-8");
		System.out.println(new String(data3,"utf-8"));
		
		
		
	}
}
