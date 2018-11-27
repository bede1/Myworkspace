package cn.sherman.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[]args) {

		List list = new ArrayList();
		list.add("aaa");  //容器中可以放任何形式的对象，字符型
		list.add(new Sherman());  //存放对象
		list.add(new Date());		//存放日期对象
		list.remove(2);
			
		
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

	

}
