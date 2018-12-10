package com.sherman.testfile;
/**
 * 三个常量
 * 1、System.in  输入流  键盘输入
 * 2、System.out 输出流   控制台输出
 *    System.err
 *    
 * ==>重定向   
 * setIn()
 * setOut()
 * setErr()
 * FileDescriptor.in
 * FileDescriptor.out
 * @author Administrator 
 * @author Auser
 *
 */
public class testSystemprint01 {
	public static void main(String[] args) {
		test1();
	}

	
	public static void test1(){
		System.out.println("test");
		System.err.println("errtest");
		
		}
}
