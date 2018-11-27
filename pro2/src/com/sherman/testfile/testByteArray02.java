package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Auser
 *
 */
public class testByteArray02 {
	public static void main(String[] args) throws IOException {
		byte[] data = getBytesFromFile("E:\\testfile\\testbuffered\\testconverfile2.txt");
		ByteArrayToFile(data,"E:\\testfile\\testbuffered\\testbytearray.txt");
	}
	
	/**
	 *  1、文件  --程序->字节数组
	 *	 1)、文件输入流 
	 * 		字节数组输出流
	 *  2、字节数组  --程序->文件
	 *  	1)、字节数组输入流
	 *  		文件输出流
	 * @param src
	 * @param destPath
	 * @throws IOException
	 */
	public static void ByteArrayToFile(byte[] src, String destPath) throws IOException {
		//创建源文件
		File dest = new File(destPath);
		//选择流，及字节数组输入流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//定义文件输出流
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
		//操作  不断读取字节数据
		byte[] flush = new byte[256];
		int len =0;
		while(-1!=(len=is.read(flush))) {
			//写出到文件中
			os.write(flush, 0, len);
		}
		os.flush();
		os.close();
		is.close();
	}
	
	/**
	 * 1、文件  --程序->字节数组
	 * @throws IOException 
	 */
	public static byte[] getBytesFromFile(String srcPath) throws IOException {
		//创建文件源
		File src = new File(srcPath);
		//创建字节数组去向
		byte[] dest = null;
		//选择流及文件输入流
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		//字节数组输出流   不能使用多态
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//操作    不断读取文件写出到字节数据流中
		byte[] flush = new byte[256];
		int len = 0;
		while(-1!=(len=is.read(flush))) {
			bos.write(flush, 0, len);
		}
		bos.flush();
		dest = bos.toByteArray();
		bos.close();
		is.close();
		
		return dest;
	}
	
}
