package com.sherman.test1;

/**
	 * 测试类的重写
	 * @author Auser
	 *
	 */
	public class TestOverride2 {
		public void main(String[]args) {
			father a = new father();
			sun b = new sun();
			a.result1();
			a.result2();
			b.result1();	//b重写父类的方法
			b.result2();  //b继承父类的方法
			b.result3();	//b独有的方法
			System.out.println("为什么不执行");
		}

	}
	 class father {
		  public void result1() {
		 System.out.println("这是父类的返回的结果");
		  }
		  public void result2() {
			 System.out.println("这是父类返回的第二个方法结果");
		 }
	 
	 }
	 class sun extends father{
		 //重写父类方法result1
		 public void result1() {
			 System.out.println("重写父类方法result1");
		 }
		  void result3() {
			 System.out.println("这是子类独有的方法result3");
		 }
	 }


