package com.sherman.testthread.sync;
/**
 * 测试抢票
 * @author Auser
 *
 */
public class Tickets implements Runnable {
	private int num = 50;
	private boolean flag = true;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(flag) {
			if(num<=0) {
				break;
			}
			for(num=50;num>0;num--) {
				System.out.println(Thread.currentThread().getName()+"抢到了"+num);
			}
			
		}
		
	}
	public boolean getFlag() {
		return this.flag;
	}
	public void setFlag(boolean flag) {
		this.flag=flag;
	}
	public int getNum() {
		return this.num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
