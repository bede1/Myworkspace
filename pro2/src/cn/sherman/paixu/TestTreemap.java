package cn.sherman.paixu;

import java.util.TreeMap;

/**
 * ����treemap
 * @author Auser
 *
 */
public class TestTreemap {
	public static void main(String[] args) {
		Person p1 = new Person("sherman",1000);
		Person p2 = new Person("dirk",90);
		Person p3 = new Person("james",800);
		Person p4 = new Person("ball",40);
		TreeMap<Person,Integer> list = new TreeMap<Person,Integer>();
		list.put(p1, 1);
		list.put(p2, 2);
		list.put(p3, 3);
		list.put(p4, 4);
		System.out.println("Ĭ������"+list.keySet());
		//ͨ�������෽ʽ���ս����������
		TreeMap<Person,Integer> list2 = new TreeMap<Person,Integer>(new java.util.Comparator<Person>(){

			@Override
			public int compare(Person arg0, Person arg1) {
				// TODO �Զ����ɵķ������
				return -(arg0.getHandsome()-arg1.getHandsome());
			}
		});
		list2.put(p4, 1);
		list2.put(p3, 2);
		list2.put(p2, 3);
		list2.put(p1, 1);
		System.out.println("�����������"+list2.keySet());
		
	}
}
