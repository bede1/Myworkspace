package com.sherman.testthread.status;
/**
 * ����join���ϲ��߳�
 * @author Auser
 *
 */
public class TestJoin extends Thread {
	public static void main(String[] args) throws InterruptedException {
		TestJoin tj = new TestJoin();
		//TestJoin tj2 = new TestJoin();
		//Thread t2 = new Thread(tj2);
		Thread t = new Thread(tj);  //����
		t.start();
		//t2.start();
		for(int i =0;i<100;i++) {
			if(i>10) {
				Thread.sleep(200);
				t.join();  //�߳�����
			}
			System.out.println("�߳��ڵ�"+i+"��");
		}
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0;i<100;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("join...."+i);
		}
	}
	
}