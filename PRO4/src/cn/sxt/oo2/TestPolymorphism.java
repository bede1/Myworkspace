package cn.sxt.oo2;
/**
 * ���Զ�̬
 * @author pc
 *
 */

public class TestPolymorphism {
	public static void main(String[]args) {
	
		Animal n = new Animal();
		animalCry(n);
		Dog d = new Dog();
		animalCry(d);   //���ɷ����Ķ�̬
		animalCry(new Cat());  //���ɷ����Ķ�̬
		Animal d1 = new Dog();  //d1�Զ�����ת��
		Dog d2 =(Dog) d1; //ǿ������ת��
		
	}

 static void animalCry(Animal a) {
	a.shout();
}
}
class Animal{
	public void shout() {
		System.out.println("����һ����");
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("������");
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("������");
	}
}