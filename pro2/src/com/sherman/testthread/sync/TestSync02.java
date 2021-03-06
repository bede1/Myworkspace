package com.sherman.testthread.sync;



/**
 * 单例设计模式：确保一个类只有一个对象，使用懒汉式
 * @author Auser
 *
 */
public class TestSync02 {
	public static void main(String[] args) throws InterruptedException {
		Thread thd1 = new Thread(Jvm.getInstance(),"张三");
		Thread.sleep(100);
		Thread thd2 = new Thread(Jvm.getInstance(),"李四");
		Thread.sleep(100);
		Thread thd3 = new Thread(Jvm.getInstance(),"王二");
		Thread.sleep(100);
		thd1.start();
		
		thd2.start();
		
		thd3.start();	
	}
	}
/**
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式  double checking
 * 步骤
 * 1.构造器私有化，用来避免外部直接创建对象
 * 2.声明一个私有的静态变量
 * 3.创建一个对外的公共的静态方法，用来访问该变量，如果变量没有对象，创建该对象
 * 
 */
class Jvm implements Runnable{
	public boolean flag = true;
	public int num = 50;
	//1.声明一个私有的静态变量
	private static Jvm instance = null;
	//2.构造器私有化，避免外部直接创建对象
	private Jvm() {
		
	}
	//3.创建一个对外的公共静态方法，用来访问该变量，如果变量没有对象，创建该对象
	public  static Jvm getInstance() {
		if(instance==null) {
			synchronized(Jvm.class) {
				if(instance==null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					instance = new Jvm();				
				}
			}
		}
		return instance;
	}
	@Override
	public void run() {
		while(flag) {
			if(num<=0) {
				break;
			}
			for(num=100;num>0;num--) {
				System.out.println(Thread.currentThread().getName()+"抢到了"+num);
			}	
	}
	}
	}