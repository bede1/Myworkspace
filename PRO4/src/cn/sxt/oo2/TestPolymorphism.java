package cn.sxt.oo2;
/**
 * 测试多态
 * @author pc
 *
 */

public class TestPolymorphism {
	public static void main(String[]args) {
	
		Animal n = new Animal();
		animalCry(n);
		Dog d = new Dog();
		animalCry(d);   //构成方法的多态
		animalCry(new Cat());  //构成方法的多态
		Animal d1 = new Dog();  //d1自动向上转型
		Dog d2 =(Dog) d1; //强制向下转型
		
	}

 static void animalCry(Animal a) {
	a.shout();
}
}
class Animal{
	public void shout() {
		System.out.println("叫了一声！");
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪");
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵");
	}
}