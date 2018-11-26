package com.sherman.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 测试字符流
 * @author pc
 *
 */
public class TestCharIo {
	public static void main(String[] args) {
		File src = new File("D:\\testio\\testchar1.txt");
		Reader reader = null;   //初始化文件，同时必须设置null
		try {
			reader = new FileReader(src);
			char[] flush = new char[1024];
			int len = 0;
			while((len=reader.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
				//System.out.println(len);
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
						
			e.printStackTrace();
			System.out.println("源文件不存在");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally {
			if(reader!=null) {
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
