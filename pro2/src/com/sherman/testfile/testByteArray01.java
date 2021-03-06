package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组 节点流
 * 数组的长度有限 ，数据量不会很大
 * 
 * 文件内容不用太大
 * 1、文件  --程序->字节数组
 * 2、字节数组  --程序->文件
 * @author Auser
 *
 */
public class testByteArray01 {
	public static void main(String[] args) throws IOException {
		read(write());
		
		
	}
	public static byte[] write() throws IOException {
		//定义目的地
		byte[] dest;
		//选择留
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//操作 写出
		String msg = "这是用来测试字节数据流";
		byte[] info = msg.getBytes();
		bos.write(info, 0, info.length);
		dest = bos.toByteArray();
		bos.close();
		return dest;
	}
	public static void read(byte[] src) throws IOException {
		//定义数据源
		//String msg = "这是用来测试字节数据流";
		//byte[] src = msg.getBytes();
		//选择流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//操作
		byte[] flush = new byte[256];
		int len = 0;
		while(-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
		//释放资源
		is.close();
		
		
	}
	
}
