package cn.sxt.oo2;
/**
 * ���Է�װ
 * @author pc
 *
 */
public class TestEncapsulation {
	public static void main(String[]args) {
		Human h = new Human();
		//h.age=12;  //�������޷��������෽���е�private ����
	}
}
 class Human{
	private int age;
	 public String name;
	void sayAge() {
		System.out.println(age);
	}
}
class Boy extends Human{
	void sayHello() {
		//  System.out.println(age);   //�����޷�ʹ�ø����˽�����Ժͷ���
		
	}
}