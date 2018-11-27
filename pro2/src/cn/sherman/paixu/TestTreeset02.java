package cn.sherman.paixu;

import java.util.TreeSet;

/**
 * 测试treeset
 * @author Auser
 *
 */
public class TestTreeset02 {
	public static void main (String[] args) {
		Worker w1 = new Worker("工程师","sherman",1000);
		Worker w2 = new Worker("教师","jackson",2000);
		Worker w3 = new Worker("游民","gamewoker",20000);
		Worker w4 = new Worker("小学生","pri_student",100);
		TreeSet<Worker> list1 = new TreeSet<Worker>();
		list1.add(w1);
		list1.add(w2);
		list1.add(w3);
		list1.add(w4);
		System.out.println("默认排序"+list1);  
		//重新定义comparator to 方法，按照薪资降序排列  并使用匿名内部类	
		TreeSet<Worker> list2 = new TreeSet<Worker>(new java.util.Comparator<Worker>() {

			@Override
			public int compare(Worker arg0, Worker arg1) {
				// TODO 自动生成的方法存根
				return -(arg0.getSalary()-arg1.getSalary());
			}
		});
		list2.add(w1);
		list2.add(w2);
		list2.add(w2);
		list2.add(w3);
		list2.add(w4);
		list2.add(w3);
		System.out.println("变更后的排序"+list2);
	}
}
