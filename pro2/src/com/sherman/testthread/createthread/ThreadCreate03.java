package com.sherman.testthread.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



/**
 * 使用Callable创建线程
 * @author Auser
 *
 */
public class ThreadCreate03 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建线程
			ExecutorService ser = Executors.newFixedThreadPool(3);
			Race play1 = new Race("乌龟",300);
			Race play2 = new Race("兔子",120);
			Future<Integer> result1=ser.submit(play1);
			Future<Integer> result2 = ser.submit(play2);
			Thread.sleep(1000*5);  //让上边线程执行5秒钟
			play1.setFlag(false);	//结束线程
			play2.setFlag(false);	//结束线程
			int num1 = result1.get();
			int num2 = result2.get();
			System.out.println("乌龟跑了 "+num1+" 步");
			System.out.println("兔子跑了 "+num2+" 步");
			ser.shutdownNow();
			
	}
}
	class Race implements Callable<Integer>{
		private String name;  //姓名
		private long time;  //行动时间
		private int step=0;	//步数
		private boolean flag = true;  //判断标志
		public Race() {
			
		}
		public Race(String name) {
			super();
			this.name = name;
		}
		public Race(String name,long time) {
			super();
			this.time = time;
			this.name = name;
					
		}
		
		@Override
		public Integer call() throws Exception {
			// TODO 自动生成的方法存根
			while(flag) {
				Thread.sleep(time);
				step++;
			}
			return step;
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getTime() {
			return time;
		}

		public void setTime(long time) {
			this.time = time;
		}

		public int getStep() {
			return step;
		}

		public void setStep(int step) {
			this.step = step;
		}

		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
	}

