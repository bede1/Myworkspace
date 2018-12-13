package com.sherman.testthread.sync;
/**
 * 单例创建的方式
 * 1.懒汉式
 * 1）构造器私有化
 * 2）声明私有的静态属性
 * 3）对外提供访问属性的静态方法，确保该对象存在
 * @author Auser
 *
 */
public class MyJvm {
	//创建私有属性
	private static MyJvm instance;
	//创建私有化构造器
	private MyJvm() {
		
	}
	//对外声明提供访问属性的静态方法
	public static MyJvm getInstance() {
		if(instance==null) {
			synchronized(MyJvm.class) {
				if(instance==null) {
					instance = new MyJvm();
				}
			}
		}
		return instance;
		
	}
}
