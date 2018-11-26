package cn.bjsxt.oop.polymorphism.myServlet;
/**
 * 测试多态的深入内存分析
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
