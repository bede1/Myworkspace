package cn.sherman.paixu;

import java.util.TreeSet;

/**
 * ����treeset
 * @author Auser
 *
 */
public class TestTreeset02 {
	public static void main (String[] args) {
		Worker w1 = new Worker("����ʦ","sherman",1000);
		Worker w2 = new Worker("��ʦ","jackson",2000);
		Worker w3 = new Worker("����","gamewoker",20000);
		Worker w4 = new Worker("Сѧ��","pri_student",100);
		TreeSet<Worker> list1 = new TreeSet<Worker>();
		list1.add(w1);
		list1.add(w2);
		list1.add(w3);
		list1.add(w4);
		System.out.println("Ĭ������"+list1);  
		//���¶���comparator to ����������н�ʽ�������  ��ʹ�������ڲ���	
		TreeSet<Worker> list2 = new TreeSet<Worker>(new java.util.Comparator<Worker>() {

			@Override
			public int compare(Worker arg0, Worker arg1) {
				// TODO �Զ����ɵķ������
				return -(arg0.getSalary()-arg1.getSalary());
			}
		});
		list2.add(w1);
		list2.add(w2);
		list2.add(w2);
		list2.add(w3);
		list2.add(w4);
		list2.add(w3);
		System.out.println("����������"+list2);
	}
}
