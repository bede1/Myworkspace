package com.sherman.testthread.status;
/**
 * 测试join：合并线程
 * @author Auser
 *
 */
public class TestJoin extends Thread {
	public static void main(String[] args) throws InterruptedException {
		TestJoin tj = new TestJoin();
		//TestJoin tj2 = new TestJoin();
		//Thread t2 = new Thread(tj2);
		Thread t = new Thread(tj);  //新生
		t.start();
		//t2.start();
		for(int i =0;i<100;i++) {
			if(i>10) {
				Thread.sleep(200);
				t.join();  //线程阻塞
			}
			System.out.println("线程在第"+i+"步");
		}
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0;i<100;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("join...."+i);
		}
	}
	
}
