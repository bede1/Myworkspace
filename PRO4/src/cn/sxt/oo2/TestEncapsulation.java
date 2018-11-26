package cn.sxt.oo2;
/**
 * 测试封装
 * @author pc
 *
 */
public class TestEncapsulation {
	public static void main(String[]args) {
		Human h = new Human();
		//h.age=12;  //主方法无法调用子类方法中的private 变量
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
		//  System.out.println(age);   //子类无法使用父类的私有属性和方法
		
	}
}