package com.sherman.testthread.pro;
/**
 * 测试实现生产者、消费者模式
 * 场景：
 * 1.生产者生产汽车
 * 2.消费者购买汽车
 * 3.汽车库存量最大100，当达到100时，生产必须停止。当库存=0时，消费必须停止
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
	private int max_storage = 100;  //定义最大库存
	private int i = 80;  //当前初始
	private int produceSpeed = 100;   //生产用时
	private int comsumeSpeed = 20;		//消费用时
	public synchronized void produce() {
		while(i==max_storage) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//生产过程耗时
		try {
			Thread.sleep(produceSpeed);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("生产了第"+i+++"台汽车");
		//唤醒
		this.notifyAll();
	}
	public synchronized void consume() {
		while(i<=1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		//消费耗时
		try {
			Thread.sleep(comsumeSpeed);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("消费了第"+i--+"台汽车");
		//唤醒
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
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		for(int i = 0;i<10000;i++) {
			stg.consume();
		}
	}
	
}
