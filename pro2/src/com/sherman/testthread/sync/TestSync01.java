package com.sherman.testthread.sync;
/**
 * û��ʹ��ͬ�����̣߳�����ȫ��������������⣬ʾ������
 * @author Auser
 *
 */
public class TestSync01 {
	public static void main(String[] args) {
		Tickets tk1 =new Tickets();
		Thread trd1 = new Thread(tk1,"����");
		Thread trd2 = new Thread(tk1,"����");
		Thread trd3 = new Thread(tk1,"����");
		trd1.start();
		trd2.start();
		trd3.start();
		
	}
}
