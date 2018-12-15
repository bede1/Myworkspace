package com.sherman.testthread.pro;
/**
 * 一个场景,共同的资源
  生产者消费者模式 信号灯法
 wait() :等待，释放锁   sleep 不释放锁
 notify()/notifyAll():唤醒
  与 synchronized
 * @author pc
 *
 */
public class Movie {
	private String pic;
	//设置信号灯模式
	//flag=true，生产者生产，消费者等待，生产完成后通知消费者
	//falg=false，生产者等待，消费者消费，消费发完成后通知生产
	private boolean flag = true;
	public synchronized void play(String pic) {
		if(!flag) {  //生产者等待
			try {
				this.wait();  //当前线程等待
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("生产了"+pic);
		//生产完毕
		this.pic = pic;
		//通知消费
		this.notify();
		//生产者停下
		this.flag = false;
	}
	public synchronized void watch() {
		if(flag) {  //消费者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//开始消费
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("消费了"+pic);
		//消费完毕
		//通知生产
		this.notify();
		//消费停止
		this.flag = true;
		
	}



}
