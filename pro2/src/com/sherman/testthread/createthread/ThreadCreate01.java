package com.sherman.testthread.createthread;
/**
 * ʹ�ü̳�Thread�ഴ�����߳�
 * ģ��������ܣ�
 	1���������߳�  �̳�  Thread  +��дrun(�߳���)
 	2��ʹ���߳�: ����������� + ����.start()  �߳�����
 * @author Auser
 *
 */
public class ThreadCreate01 extends Thread {

	@Override
	public void run() {
		// �߳���
		for(int i = 0;i<100;i++) {
			System.out.println("�������� "+i+" ��...");
		}
	}
	
}
 class Tortoise extends Thread{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int j = 0;j<100;j++) {
			System.out.println("�ڹ����� "+j+" ����������");
		}
	}
	
}
