package com.sherman.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试IO流
 * @author pc
 *
 */
public class TestIo {
	public static void main (String[] args) {
		//1.建立联系File对象
		File src = new File("D:/testio/a.txt");
		//2.选择流
		InputStream is = null;  //提升作用域
		int i=0;
		try {
			is = new FileInputStream(src);
			byte[] car = new byte[1];
			//int len = 0; 
			StringBuilder sb = new StringBuilder();
			while((is.read(car))!=-1) {
				String info = new String(car,0,car.length);
				sb.append(info);
				i++;
			}
			System.out.println(sb.toString());
			System.out.println(i);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("找不到文件");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件读取失败");
		}
		finally {
			try {
				if (is !=null) {
					is.close();
				}
			}catch(Exception e2) {
				System.out.println("关闭文件输入流失败");
			}
		}
		
	}
}
