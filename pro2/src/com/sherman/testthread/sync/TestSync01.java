package com.sherman.testthread.sync;
/**
 * 没有使用同步的线程，不安全，会存在数据问题，示例如下
 * @author Auser
 *
 */
public class TestSync01 {
	public static void main(String[] args) {
		Tickets tk1 =new Tickets();
		Thread trd1 = new Thread(tk1,"张三");
		Thread trd2 = new Thread(tk1,"李四");
		Thread trd3 = new Thread(tk1,"王二");
		trd1.start();
		trd2.start();
		trd3.start();
		
	}
}
