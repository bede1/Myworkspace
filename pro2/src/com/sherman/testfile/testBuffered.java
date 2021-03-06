package com.sherman.testfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 测试缓冲流
 * @author Auser
 *
 */
public class testBuffered {
	public static void main(String[] args) {
		File src = new File("E:\\testfile\\testbuffered\\testbuffer.java");
		File dest = new File("E:\\testfile\\testbuffered\\testbuffer2.xls");
		BufferedReader reader = null;
		BufferedWriter wr = null;
		try {
			reader = new BufferedReader(new FileReader(src));
			wr = new BufferedWriter(new FileWriter(dest));
			String line = null;
			while((line=reader.readLine())!=null) {
				wr.write(line);
				wr.newLine();  //换行
			}
			wr.flush();  //强制刷出
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件读取失败");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件写入失败");
		}finally {
			if(null != wr) {
				try {
					wr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}   //关闭文件
			}
			if(null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
