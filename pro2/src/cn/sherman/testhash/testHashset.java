package cn.sherman.testhash;

import java.util.HashSet;
import java.util.Set;

/**
 * ����hashset
 * @author Auser
 *
 */
public class testHashset {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		set1.add("9090");
		set1.remove("9090");
		set1.add(new String("dads"));
		set1.add("9090");  //setΪ�����ظ�
		set1.remove("9090");
		System.out.println(set1.hashCode());
		System.out.println(set1.size());
	}
}
