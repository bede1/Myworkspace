package com.sherman.test1;
/**
 * ����string��Դ��
 * @author Auser
 *
 */

public class TestStringJDK {
	 
	public static void main(String[] args) {
		// String a = "aaa";
		StringBuilder b = new StringBuilder("hhhaaahajd");
		StringBuilder a = new StringBuilder("sdd");
		//StringBuilder c = new StringBulider(TestAnimal.Human())  //StringBulider����û�ж�����������ķ���
		System.out.println(b.append(a));
		System.out.println(TestAnimal.Human());
		System.out.println(b.reverse());
	}

}
