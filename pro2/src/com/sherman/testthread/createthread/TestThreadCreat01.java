package com.sherman.testthread.createthread;
/**
 * 用来测试调用ThreadCreate01类
 * @author Auser
 *
 */
public class TestThreadCreat01 {
	//创建子类对象
	public static void main(String[] args) {
		ThreadCreate01 tc = new ThreadCreate01();
		Tortoise tt = new Tortoise();
		//调用start方法
		tc.start();
		tt.start();
		
	}
	
	
}
