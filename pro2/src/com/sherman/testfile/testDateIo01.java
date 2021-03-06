package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试处理流01
 * 数据类型（基本+String）处理流
 * 1.输入流 DataInputStream   readXXXX()
 * 2.输出流DataOutputStream   writeXXXX()
 * 新增方法不能使用多态
 * java.io.EOFException :没有读取到相关的内容
 * @author Auser
 *
 */
public class testDateIo01 {
		public static void main(String[] args) throws IOException {
			write("E:\\testfile\\testdataio\\test1.txt");
			read("E:\\testfile\\testdataio\\test1.txt");
		}
	
	public static void read(String outputPath) throws IOException {
		//创建源
		File src = new File(outputPath);
		//选择流
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream(src))
				);
		//操作  读取的顺序与写出的顺序必须一致（若不一致，则显示的内容会存在问题），必须存在才能读取
		//long long2 = dis.readLong();
		double dou1 = dis.readDouble();
		long long1 = dis.readLong();
		String str = dis.readUTF();
		dis.close();
		System.out.println(dou1+"##"+long1+"##"+str);
	}
	
	public static void write(String outputPath) throws IOException {
		double point = 2369;
		long num = 100L;
		String str = "测试数据";
		File output = new File(outputPath);
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(output))
				);
		//操作  写出的顺序，为读取做准备
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
	
}
