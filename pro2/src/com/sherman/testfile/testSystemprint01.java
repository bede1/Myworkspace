package com.sherman.testfile;
/**
 * ��������
 * 1��System.in  ������  ��������
 * 2��System.out �����   ����̨���
 *    System.err
 *    
 * ==>�ض���   
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
