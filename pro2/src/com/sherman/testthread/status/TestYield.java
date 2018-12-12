package com.sherman.testthread.status;
/**
 * 测试yield
 * @author Auser
 *
 */
public class TestYield extends Thread{
	public static void main(String[] args) throws InterruptedException {
		TestYield ty = new TestYield();
		Thread td = new Thread(ty);
		td.start();
		for (int i = 0;i<100;i++) {
			if(i%30==0) {
				//暂停本线程
				
				Thread.yield();
				
			}
			//Thread.sleep(0);
			System.out.println("main...."+i);
		}
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0;i<1000;i++) {
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
			System.out.println("yield..."+i);
		}
	}
	
	
}
