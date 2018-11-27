package com.sherman.test1;
/**
 * 测试string类源码
 * @author Auser
 *
 */

public class TestStringJDK {
	 
	public static void main(String[] args) {
		// String a = "aaa";
		StringBuilder b = new StringBuilder("hhhaaahajd");
		StringBuilder a = new StringBuilder("sdd");
		//StringBuilder c = new StringBulider(TestAnimal.Human())  //StringBulider类中没有定义出插入对象的方法
		System.out.println(b.append(a));
		System.out.println(TestAnimal.Human());
		System.out.println(b.reverse());
	}

}
