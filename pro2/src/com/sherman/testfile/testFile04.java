package com.sherman.testfile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 5、操作目录
mkdir() 创建目录，必须确保 父目录存在，如果不存在，创建失败
mkdirs() 创建目录，如果父目录链不存在一同创建
list() 文件|目录 名字符串形式
listFiles()
static listRoots() 根路径
 * @author Auser
 *
 */
public class testFile04 {
	public static void main(String[] args) {
		String path = "E:/testfile/test";
		File src = new File(path);
		if(src.isDirectory()) {
			System.out.println("下级目录名及子目录");
			String[] subNames = src.list();
			if(subNames.length==0) {
				System.out.println("空目录，无文件");
			}
			//System.out.println(subNames[0]);  //测试使用
		for(String temp:subNames) {
			System.out.println(temp);
		}
		File[] subFiles = src.listFiles();
		if(subFiles.length==0) {
			System.out.println("无文件，无法输出路径");
		}
		for(File temp:subFiles) {
			System.out.println(temp.getAbsolutePath());
		}
		System.out.println("------子文件.java对象------");
		//命令设计模式
		subFiles = src.listFiles(new FilenameFilter(){

			@Override
			public boolean accept(File arg0, String arg1) {
				// TODO 自动生成的方法存根
				return new File(arg0,arg1).isFile()&&arg1.endsWith(".java");
			}
			
		});
		for (File temp:subFiles) {
			System.out.println(temp.getAbsolutePath());
		}
		
		}
		
		
	}

}
