package cn.bjsxt.oop.polymorphism.myServlet;
/**
 * ���Զ�̬�������ڴ����
 * @author pc
 *
 */

public class HttpServlet {
	public void service() {
		System.out.println("HttpServlet.service()");
		doGet();
	}
	public void doGet() {
		System.out.println("HttpServlet.doGet()");
	}
	public void doPost() {
		
	}
}
