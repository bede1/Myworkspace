package com.sherman.testthread.info;
/**
 * ���������̻߳�����
 * @author Auser
 *
 */
public class BaseThread implements Runnable {
	private boolean flag = true;
	private short num = 0;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(flag) {
			System.out.println(Thread.currentThread().getName()+"----"+num++);
		}
		
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
