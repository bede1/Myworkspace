package com.sherman.test1;

/**
	 * ���������д
	 * @author Auser
	 *
	 */
	public class TestOverride2 {
		public void main(String[]args) {
			father a = new father();
			sun b = new sun();
			a.result1();
			a.result2();
			b.result1();	//b��д����ķ���
			b.result2();  //b�̳и���ķ���
			b.result3();	//b���еķ���
			System.out.println("Ϊʲô��ִ��");
		}

	}
	 class father {
		  public void result1() {
		 System.out.println("���Ǹ���ķ��صĽ��");
		  }
		  public void result2() {
			 System.out.println("���Ǹ��෵�صĵڶ����������");
		 }
	 
	 }
	 class sun extends father{
		 //��д���෽��result1
		 public void result1() {
			 System.out.println("��д���෽��result1");
		 }
		  void result3() {
			 System.out.println("����������еķ���result3");
		 }
	 }


