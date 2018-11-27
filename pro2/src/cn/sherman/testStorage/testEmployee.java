package cn.sherman.testStorage;
/**
 * ≤‚ ‘employee¿‡
 * @author Auser
 *
 */

import java.util.ArrayList;
import java.util.List;

public class testEmployee {
	public static void main(String[] args) {
		Employee e1  = new Employee(1001,"sherman",5000,"yy","1987-10");
		Employee e2 = new Employee(1002,"jack",4000,"yy","1988-09");
		Employee e3 = new Employee(1003,"lucy",6000,"uu","1999-09");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		printName(list);
		printIdAndName(list);
		
	}
	public static void printName(List<Employee> list) {
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}
	public static void printIdAndName(List<Employee> list) {
		System.out.println("ID"+"\t"+"NAME");
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getId()+"\t"+list.get(i).getName());
		}
	}

}
