package com.sherman.testthread.createthread;
/**
 * �������Ե���ThreadCreate01��
 * @author Auser
 *
 */
public class TestThreadCreat01 {
	//�����������
	public static void main(String[] args) {
		ThreadCreate01 tc = new ThreadCreate01();
		Tortoise tt = new Tortoise();
		//����start����
		tc.start();
		tt.start();
		
	}
	
	
}