package com.sherman.testthread.sync;
/**
 * ���������ķ�ʽ
 * 1.����ʽ
 * 1��������˽�л�
 * 2������˽�еľ�̬����
 * 3�������ṩ�������Եľ�̬������ȷ���ö������
 * @author Auser
 *
 */
public class MyJvm {
	//����˽������
	private static MyJvm instance;
	//����˽�л�������
	private MyJvm() {
		
	}
	//���������ṩ�������Եľ�̬����
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
