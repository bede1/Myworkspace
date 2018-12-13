package com.sherman.testthread.sync;
/**
 * 设计模式
 * 2.饿汉式
 * 1)构造器私有化
 * 2）声明私有的静态属性，同时创建该对象
 * 3）对外声明访问属性的静态方法
 * 
 * 
 * @author Auser
 *
 */
public class MyJvm2 {
	//声明私有的静态属性，并创建该对象
	private static MyJvm2 instance = new MyJvm2();
	//构造器私有化
	private MyJvm2() {
		
	}
	public static MyJvm2 getInstance() {
		return instance;
	}
}
