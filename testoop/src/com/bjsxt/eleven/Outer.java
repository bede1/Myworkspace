package com.bjsxt.eleven;

import com.bjsxt.eleven.Face.Nose;

/**
 * �����ڲ���
 * @author pc
 *
 */
public class Outer {
	public static void main (String[] args) {
		//Nose n = new Nose();   //������ֱ�ӹ����ڲ��࣬����Ĵ����ⲿ�������
		Face f = new Face();
		//����ʵ�����ڲ���ķ���
		Nose n = f.new Nose();  //����1
		Face.Nose m = f.new Nose();  //����2
		//Nose m = new Face.new Nose();
		n.breath();
		//��̬���ʵ��������
		Face.Ear e = new Face.Ear();  
		e.listen();
	}

}

class Face{
	int type;
	static String color = "��";
	//����Ǿ�̬�ڲ���
	class Nose{
		String type;
		void breath() {
			System.out.println(Face.this.type);  //�����ⲿ�����
			System.out.println("����");
		}
	}
	
	static class Ear{
		void listen() {
			System.out.println(Face.color);    //��̬�ڲ�������ⲿ�����.
			//System.out.println(Face.type);  //��̬�ڲ���
		}
	}
}