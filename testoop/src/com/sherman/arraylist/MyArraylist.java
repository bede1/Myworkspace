package com.sherman.arraylist;


/**
 * ������дarraylist
 * @author pc
 *
 */
public class MyArraylist {
	
	private int size;
	private Object[] elementData;
	public MyArraylist(int elementCapacity) {
		if (elementCapacity<0) {
			try {
				throw new Exception("�����������");
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			this.elementData = new Object[elementCapacity];
			
		}
	}
	public MyArraylist() {
		this(10);   //Ĭ������Ϊ10
		
	}
	//дADD����
	public void add(Object obj) {
				
		if(size>=elementData.length) {
			Object[] newArraylist = new Object[size*2];
			//System.arraycopy(elementData, 0, newArraylist, 0, elementData.length-1);
			//�ڶ��ָ�������ķ���
			for(int i=0;i<elementData.length;i++) {
				newArraylist[i]=elementData[i];
				//elementData[i] = newArraylist[i];
			}
			elementData = newArraylist;   //��elementdata�����µ�����ֵ
			
		}
		elementData[size++] = obj;
		//size++;
		
	}

}
