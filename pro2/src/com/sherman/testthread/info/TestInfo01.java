package com.sherman.testthread.info;
/**
 * Thread.currentThread()	 :��ǰ�߳�
  setName():��������
  getName():��ȡ����
  isAlive():�ж�״̬
 * @author Auser
 *
 */
public class TestInfo01  {
	public static void main(String[] args) throws InterruptedException {
		BaseThread bt1 = new BaseThread();
		BaseThread bt2 = new BaseThread();
		BaseThread bt3 = new BaseThread();
		Thread td1 = new Thread(bt1,"���Ե�һ���߳�");
		td1.setName("sherman-1");
		Thread td2 = new Thread(bt2,"���Եڶ����߳�");
		Thread td3 = new Thread(bt3,"���Ե������߳�");
		
		td1.start();
		td2.start();
		td3.start();
		
		System.out.println(td1.getName()+"  "+td2.getName()+"  "+td3.getName());
		Thread.sleep(1000*5);
		bt1.setFlag(false);
		bt2.setFlag(false);
		bt3.setFlag(false);

	
		
	}

}