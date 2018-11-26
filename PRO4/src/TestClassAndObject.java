

/**
 * 
 * @author pc
 *  测试类和对象
 */
public class TestClassAndObject {
	//属性field
	int id;
	String name;
	int age;
	Computer comp;   //计算机
	
	//方法
	void study() {
		System.out.println("我要认证学习"+comp.brand);
		
	}
	//方法
	void play() {
		System.out.println("我在玩nfs"+"并且我的电脑品牌是"+comp.brand);
	}
	//程序的入口，必须要有main方法
	public static void main(String[] args) {
		TestClassAndObject stu = new TestClassAndObject();
		stu.id = 1001;
		stu.age = 20;
		stu.name = "sherman";

		Computer c1 = new Computer();
		c1.brand = "thinkpad";
		stu.comp = c1;     //将c1对象的属性传给了stu对象的comp属性
		stu.study();
		stu.play();
	}
	
	
}

class Computer{
	String brand;
	
	
}


