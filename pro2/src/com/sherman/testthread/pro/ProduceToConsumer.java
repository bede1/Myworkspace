package com.sherman.testthread.pro;
/**
 * ����ʵ�������ߡ�������ģʽ
 * ������
 * 1.��������������
 * 2.�����߹�������
 * 3.������������100�����ﵽ100ʱ����������ֹͣ�������=0ʱ�����ѱ���ֹͣ
 * @author Auser
 *
 */
public class ProduceToConsumer {
	public static void main(String[] args) {
		Storage stg = new Storage();
		Producer pdr = new Producer(stg);
		Comsumer csr = new Comsumer(stg);
		Thread thd1 = new Thread(pdr);
		Thread thd2 = new Thread(csr);
		
		thd1.start();
		thd2.start();
		
	}
}

class Storage{
	private int max_storage = 100;  //���������
	private int i = 80;  //��ǰ��ʼ
	private int produceSpeed = 100;   //������ʱ
	private int comsumeSpeed = 20;		//������ʱ
	public synchronized void produce() {
		while(i==max_storage) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//�������̺�ʱ
		try {
			Thread.sleep(produceSpeed);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("�����˵�"+i+++"̨����");
		//����
		this.notifyAll();
	}
	public synchronized void consume() {
		while(i<=1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//���Ѻ�ʱ
		try {
			Thread.sleep(comsumeSpeed);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("�����˵�"+i--+"̨����");
		//����
		this.notifyAll();
	}
}

class Producer implements Runnable {
	Storage stg = null;
	public Producer(Storage stg) {
		this.stg = stg;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i =0;i<10000;i++) {
			stg.produce();
		}
		
	}
	
}

class Comsumer implements Runnable{
	Storage stg = null;
	public Comsumer(Storage stg) {
		this.stg = stg;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0;i<10000;i++) {
			stg.consume();
		}
	}
	
}