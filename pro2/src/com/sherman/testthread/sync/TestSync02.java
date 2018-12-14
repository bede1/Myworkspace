package com.sherman.testthread.sync;



/**
 * �������ģʽ��ȷ��һ����ֻ��һ������ʹ������ʽ
 * @author Auser
 *
 */
public class TestSync02 {
	public static void main(String[] args) throws InterruptedException {
		Thread thd1 = new Thread(Jvm.getInstance(),"����");
		Thread.sleep(100);
		Thread thd2 = new Thread(Jvm.getInstance(),"����");
		Thread.sleep(100);
		Thread thd3 = new Thread(Jvm.getInstance(),"����");
		Thread.sleep(100);
		thd1.start();
		
		thd2.start();
		
		thd3.start();	
	}
	}
/**
 * �������ģʽ
 * ȷ��һ����ֻ��һ������
 * ����ʽ  double checking
 * ����
 * 1.������˽�л������������ⲿֱ�Ӵ�������
 * 2.����һ��˽�еľ�̬����
 * 3.����һ������Ĺ����ľ�̬�������������ʸñ������������û�ж��󣬴����ö���
 * 
 */
class Jvm implements Runnable{
	public boolean flag = true;
	public int num = 50;
	//1.����һ��˽�еľ�̬����
	private static Jvm instance = null;
	//2.������˽�л��������ⲿֱ�Ӵ�������
	private Jvm() {
		
	}
	//3.����һ������Ĺ�����̬�������������ʸñ������������û�ж��󣬴����ö���
	public  static Jvm getInstance() {
		if(instance==null) {
			synchronized(Jvm.class) {
				if(instance==null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
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
				System.out.println(Thread.currentThread().getName()+"������"+num);
			}	
	}
	}
	}