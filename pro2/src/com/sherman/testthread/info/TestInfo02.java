package com.sherman.testthread.info;
/**
 * ���ȼ�������Ϊ���ʣ����Ǿ��Ե��Ⱥ�˳��
 *  MAX_PRIORITY  10
   NORM_PRIORITY 5 (Ĭ��)
   MIN_PRIORITY  1
   setPriority()
   getPriority()
   
 * @author Auser
 *
 */
public class TestInfo02 {
	public static void main(String[] args) throws InterruptedException {
			BaseThread bt1 = new BaseThread();
			BaseThread bt2 = new BaseThread();
			BaseThread bt3 = new BaseThread();
			Thread td1 = new Thread(bt1,"���Ե�һ���߳�");
			Thread td2 = new Thread(bt2,"���Եڶ����߳�");
			Thread td3 = new Thread(bt3,"���Ե������߳�");
			//td1.setPriority(10);
			td1.setPriority(Thread.MAX_PRIORITY);
			//td2.setPriority(5);
			td2.setPriority(Thread.NORM_PRIORITY);
			//td3.setPriority(1);
			td3.setPriority(Thread.MIN_PRIORITY);
			td1.start();
			td2.start();
			td3.start();
			Thread.sleep(1000*5);
			bt1.setFlag(false);
			bt2.setFlag(false);
			bt3.setFlag(false);
	}
}
