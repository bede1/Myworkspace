package com.sherman.testthread.sync;
/**
 * ���ģʽ
 * 2.����ʽ
 * 1)������˽�л�
 * 2������˽�еľ�̬���ԣ�ͬʱ�����ö���
 * 3�����������������Եľ�̬����
 * 
 * 
 * @author Auser
 *
 */
public class MyJvm2 {
	//����˽�еľ�̬���ԣ��������ö���
	private static MyJvm2 instance = new MyJvm2();
	//������˽�л�
	private MyJvm2() {
		
	}
	public static MyJvm2 getInstance() {
		return instance;
	}
}
