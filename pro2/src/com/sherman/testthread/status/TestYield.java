package com.sherman.testthread.status;
/**
 * ����yield
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
				//��ͣ���߳�
				
				Thread.yield();
				
			}
			//Thread.sleep(0);
			System.out.println("main...."+i);
		}
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0;i<1000;i++) {
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO �Զ����ɵ� catch ��
//				e.printStackTrace();
//			}
			System.out.println("yield..."+i);
		}
	}
	
	
}