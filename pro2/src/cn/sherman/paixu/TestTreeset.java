package cn.sherman.paixu;

import java.util.TreeSet;

/**
 * 测试treeset
 * @author Auser
 *
 */
public class TestTreeset {
	public static void main(String[] args) {
	
		Person p1 = new Person("sherman",100);
		Person p2 = new Person("jackson",10);
		Person p3 = new Person("back",50);
		Person p4 = new Person("bede",9000);
		//必须提供comparator比较器，此处定义为匿名内部类
		TreeSet<Person> list = new TreeSet<Person>(new java.util.Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO 自动生成的方法存根
				//按照升序
				return o1.getHandsome()-o2.getHandsome();
			}
			
		});
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		//System.out.println(list);
	}
}
