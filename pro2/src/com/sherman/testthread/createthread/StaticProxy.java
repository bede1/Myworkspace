package com.sherman.testthread.createthread;
/**
 * ���Ծ�̬����  ���ģʽ
 * 1.��ʵ��ɫ
 * 2.������ɫ ���������ʵ��ɫ������
 * 3.����  ʵ����ͬ�Ľӿ�
 * @author Auser
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//������ʵ��ɫ
		You you = new You();
		//����������ɫ+��ʵ��ɫ������
		WeddingCompany wc = new WeddingCompany(you);
		wc.Marry();
	}
}
//����ӿ�
interface Marry{
	public abstract void Marry();
}
class You implements Marry{

@Override
public void Marry() {
	// TODO �Զ����ɵķ������
	System.out.println("����϶����ˡ�����");
	
}
}
class WeddingCompany implements Marry{
	private You yu;
	public WeddingCompany() {
		
	}
	public WeddingCompany(You yu) {
		this.yu = yu;
		
	}
	private static void before() {
		System.out.println("�Ȳ��÷���");
	}
	private static void after() {
		System.out.println("����ֶ���");
	}
	@Override
	public void Marry() {
		// TODO �Զ����ɵķ������
		before();
		yu.Marry();
		after();
		
		
	}
	
}


