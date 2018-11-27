package cn.sherman.collection;

import java.util.LinkedList;


/**
 * ²âÊÔlinkedlistÓÃ·¨
 * @author Auser
 *
 */
public class TestLinkedlist {
	public static void main(String[] args) {
		LinkedList test01 = new LinkedList();
		test01.add("dda");
		test01.add("009");
		test01.add("dda");
		TestMyArraylist list1 = new TestMyArraylist() ;
		//list1.getlist();
		test01.add(list1.getlist());
		
		System.out.println(test01);
	}

	
}
