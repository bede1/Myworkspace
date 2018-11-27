package cn.sherman.collection;

import java.util.ArrayList;

/**
 * �Լ���дarraylist�ṹ
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
	//�����������ֵ����У������ֵ�Ƿ�Ϲ�
	public  MyArraylist(int capacity) {
			//sizel =capacity;
			if (capacity < 0) {
				throw new IllegalArgumentException("��������С��0");
			} 
			else {
				elementData = new Object[capacity];	
				}
						}
	//û�и���ֵ������£�Ĭ������Ϊ10
	public MyArraylist() {
		this(3);
	}
	//����add����,�漰����������
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
	//��ȡ�������ڵ�����ֵ
	public Object getElement(int i) {
		if(indexCheck(i)) {
		 return  elementData[i];
	}
		else return "����Ĳ������Ϲ�";
	
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
	
	//����������ַɾ������ֵ
	public void remove(int i) {
		if(indexCheck(i)) {
			Object[] newValue =new Object[sizel];
			for(int j=i;j<sizel;j++) {
				newValue[j]=elementData[j+1];
				elementData[j]=newValue[j];
			}
			sizel = sizel-1;
		}
		else System.out.println("����Ĳ������Ϲ�");

	}
	//����������ֵ�Ƿ���������
	
	
	
	public void remove(Object obj) {
		//�ȶ�obj������Ч��У��
		if(indexElement(obj)>=0) {
		for(int i=0;i<sizel;i++) {
			if (elementData[i]==obj) {
				remove(i);
			}
		}
	}
		else System.out.println("�����Ԫ���������в�����");

	}
	//��ӡ����������Ԫ��
	public void printList() {
		for (int i=0;i<sizel;i++) {
			System.out.println(getElement(i));
		}
	}
	
	}
