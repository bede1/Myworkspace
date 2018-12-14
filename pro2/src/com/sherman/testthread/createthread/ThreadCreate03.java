package com.sherman.testthread.createthread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



/**
 * ʹ��Callable�����߳�
 * @author Auser
 *
 */
public class ThreadCreate03 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�����߳�
			ExecutorService ser = Executors.newFixedThreadPool(3);
			Race play1 = new Race("�ڹ�",300);
			Race play2 = new Race("����",120);
			Future<Integer> result1=ser.submit(play1);
			Future<Integer> result2 = ser.submit(play2);
			Thread.sleep(1000*5);  //���ϱ��߳�ִ��5����
			play1.setFlag(false);	//�����߳�
			play2.setFlag(false);	//�����߳�
			int num1 = result1.get();
			int num2 = result2.get();
			System.out.println("�ڹ����� "+num1+" ��");
			System.out.println("�������� "+num2+" ��");
			ser.shutdownNow();
			
	}
}
	class Race implements Callable<Integer>{
		private String name;  //����
		private long time;  //�ж�ʱ��
		private int step=0;	//����
		private boolean flag = true;  //�жϱ�־
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
			// TODO �Զ����ɵķ������
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
