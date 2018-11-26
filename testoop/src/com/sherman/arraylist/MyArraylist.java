package com.sherman.arraylist;


/**
 * 测试手写arraylist
 * @author pc
 *
 */
public class MyArraylist {
	
	private int size;
	private Object[] elementData;
	public MyArraylist(int elementCapacity) {
		if (elementCapacity<0) {
			try {
				throw new Exception("容量定义错误");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			this.elementData = new Object[elementCapacity];
			
		}
	}
	public MyArraylist() {
		this(10);   //默认容量为10
		
	}
	//写ADD方法
	public void add(Object obj) {
				
		if(size>=elementData.length) {
			Object[] newArraylist = new Object[size*2];
			//System.arraycopy(elementData, 0, newArraylist, 0, elementData.length-1);
			//第二种复制数组的方法
			for(int i=0;i<elementData.length;i++) {
				newArraylist[i]=elementData[i];
				//elementData[i] = newArraylist[i];
			}
			elementData = newArraylist;   //将elementdata赋予新的数组值
			
		}
		elementData[size++] = obj;
		//size++;
		
	}

}
