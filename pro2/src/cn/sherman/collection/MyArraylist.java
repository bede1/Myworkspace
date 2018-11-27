package cn.sherman.collection;

import java.util.ArrayList;

/**
 * 自己手写arraylist结构
 * @author Auser
 *
 */
public class MyArraylist  {

	private int sizel;
	
	private Object[] elementData;
	
	public int getSize(){
		return sizel;
	}
	public boolean isEmty() {
		if(sizel==0) {
			return true;
		}
		return false;
	}
	//如果给与容量值，则校验容量值是否合规
	public  MyArraylist(int capacity) {
			//sizel =capacity;
			if (capacity < 0) {
				throw new IllegalArgumentException("容量不能小于0");
			} 
			else {
				elementData = new Object[capacity];	
				}
						}
	//没有给定值的情况下，默认容量为10
	public MyArraylist() {
		this(3);
	}
	//定义add方法,涉及到扩容问题
	public void add(Object a) {
		if(sizel>=elementData.length) {
			//elementData = new Object[size*2];
			Object[] newvalue = new Object[sizel*2];
			for (int i = 0;i<elementData.length;i++) {
				newvalue[i] = elementData[i]; 
			}
			elementData = newvalue;
		}
		elementData[sizel++]=a;
		
	}
	private boolean indexCheck(int i) {
		
		if (i<0) {
			return false;
		}
		else if (i>=sizel) {
			return false;
		}
		else  return true;
	}
	//获取索引所在的数组值
	public Object getElement(int i) {
		if(indexCheck(i)) {
		 return  elementData[i];
	}
		else return "输入的参数不合规";
	
	}
	public int indexElement(Object obj) {
		if(obj==null) {
			for(int i =0;i<sizel;i++) {
				if(elementData[i]==null) {
					return i;
				}
			}
		}
		else {
			for(int i =0;i<sizel;i++) {
				if(elementData[i]==obj) {
					return i;
				}
			}
		}
			
		return -1;
	}
	
	//根据索引地址删除数组值
	public void remove(int i) {
		if(indexCheck(i)) {
			Object[] newValue =new Object[sizel];
			for(int j=i;j<sizel;j++) {
				newValue[j]=elementData[j+1];
				elementData[j]=newValue[j];
			}
			sizel = sizel-1;
		}
		else System.out.println("输入的参数不合规");

	}
	//检查所输入的值是否在数组中
	
	
	
	public void remove(Object obj) {
		//先对obj进行有效性校验
		if(indexElement(obj)>=0) {
		for(int i=0;i<sizel;i++) {
			if (elementData[i]==obj) {
				remove(i);
			}
		}
	}
		else System.out.println("输入的元素在数组中不存在");

	}
	//打印容器中所有元素
	public void printList() {
		for (int i=0;i<sizel;i++) {
			System.out.println(getElement(i));
		}
	}
	
	}

