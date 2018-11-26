package cn.sxt.oo2;

/**
 * 测试继承
 * @author pc
 *
 */
public class TestExtends {
	public static void main(String[]args) {
		Student stu = new Student();
		stu.name = "高淇";
		stu.height = 180;
		stu.rest();
		Student stu2 = new Student("高见",30,"主数据");
		stu2.study();
	}
	
}
class Person{
	String name;
	int height;
public void rest() {
	System.out.println("休息一会");
}
}
//Student继承Person类的name、height属性，即student 不需要重复定义name、height属性
class Student extends Person{
	String major;
	public void study() {
		System.out.println("学习两个小时");
	}
	public Student(String name,int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	//构造一个空的对象，邹泽系统报错，类中无方法
	public Student() {
		
	}
}