package cn.sherman.collection;

import java.util.ArrayList;
import java.util.List;

/**测试调用自定义的MyArraylist
 * 
 * @author Auser
 *
 */
public class TestMyArraylist {

	public TestMyArraylist() {
		MyArraylist list = new MyArraylist();
		MyArraylist list1 = new MyArraylist();
		list = getlist();
	//	Test02 list4 = new Test02(3);
//		list.add("dff");
//		list.add("lfkdlfkd");
//		list.add("dfd");
//		list.add("dfds");
//		list.add("dfsd");
//		list.add("123");
//		list.add("1234");list.add("123");list.add("1232");list.add("1233");list.add("123");
		List list2 = new ArrayList(2);
		list2.add("fdaf");
		list2.add("93038");
		
		
//		
//		System.out.println(list.getSize());
//		System.out.println(list1.isEmty());
//		//System.out.println("长度"+list4.size());
//		System.out.println("jdk_void is"+list2.size());
//		System.out.println(list2);
//		System.out.println(list.getElement(0));
//		System.out.println(list.getElement(3)+"&&"+list.getElement(4));
//		list.remove(2);
//		System.out.println(list.getElement(3)+"&&"+list.getElement(4));
//		System.out.println(list.indexElement("dfd"));
//		list.remove("123");
//		System.out.println(list.getSize());
//		list.printList();
		
	}	
	
	public MyArraylist getlist() {
		MyArraylist list = new MyArraylist();
		list.add("dff");
		list.add("lfkdlfkd");
		list.add("dfd");
		list.add("dfds");
		list.add("dfsd");
		list.add("123");
		list.add("1234");list.add("123");list.add("1232");list.add("1233");list.add("123");
		return list;
	}
	public MyArraylist getlist(MyArraylist list2) {
		return list2;

	}
	
}

