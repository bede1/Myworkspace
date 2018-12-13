package com.sherman.testthread.info;
/**
 * 创建测试线程基础类
 * @author Auser
 *
 */
public class BaseThread implements Runnable {
	private boolean flag = true;
	private short num = 0;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
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
