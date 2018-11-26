package com.sherman.file;

import java.io.File;

/**
 * 两个常量
 * 1.路径分隔符
 * 2.文件分隔符（window系统：
 * @author pc
 *
 */
public class TestFile {
	public static void main(String args[]) {
		System.out.println(File.pathSeparator);  
		System.out.println(File.separator);    //路径分隔符  做到跨平台
		String path = "E:"+File.separator+"XP"+File.separator+"test"+File.separator+"2.jpg";  //用separator做到跨平台
		System.out.println(path);
	}
}
