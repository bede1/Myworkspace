package cn.sherman.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[]args) {

		List list = new ArrayList();
		list.add("aaa");  //�����п��Է��κ���ʽ�Ķ����ַ���
		list.add(new Sherman());  //��Ŷ���
		list.add(new Date());		//������ڶ���
		list.remove(2);
			
		
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

	

}
