package cn.bjsxt.oop.abstractClass;
/**
 * ���Գ�����
 * @author pc
 *
 */
public abstract class Animal {
	public abstract void run() ;   //���󷽷��Ķ��壬ֻ������������Ҫ������
		
	
}
//�������ʵ�ֳ��󷽷���������벻ͨ��

class Cat extends Animal {
	//��run��������д
	public void run() {
		System.out.println("�������ʵ�ֳ��󷽷���������벻ͨ��");
		
	}
	
}