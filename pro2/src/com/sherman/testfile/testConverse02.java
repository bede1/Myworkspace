package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 测试转换流：字节转字符
 * @author Auser
 *
 */
public class testConverse02 {
	public static void main(String[] args) throws IOException {
		BufferedReader breader = new BufferedReader(
				new InputStreamReader(new BufferedInputStream(
						new FileInputStream(new File("E:\\testfile\\testbuffered\\testbuffer.txt"))),"UTF-8")   //制定字符集UTF-8
				);
		BufferedWriter bwriter = new BufferedWriter(
				new OutputStreamWriter(
						new BufferedOutputStream(
						new FileOutputStream(
								new File("E:\\testfile\\testbuffered\\testconverfile.txt")))));
		String str = null;
		try {
			while(null!=(str=breader.readLine())) {
				bwriter.write(str);
				bwriter.newLine();
				
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件读取异常");
		}
		bwriter.flush();
			try {
				bwriter.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				breader.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
	}
}
