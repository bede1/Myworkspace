package cn.sxt.oo2;

/**
 * ���Լ̳�
 * @author pc
 *
 */
public class TestExtends {
	public static void main(String[]args) {
		Student stu = new Student();
		stu.name = "���";
		stu.height = 180;
		stu.rest();
		Student stu2 = new Student("�߼�",30,"������");
		stu2.study();
	}
	
}
class Person{
	String name;
	int height;
public void rest() {
	System.out.println("��Ϣһ��");
}
}
//Student�̳�Person���name��height���ԣ���student ����Ҫ�ظ�����name��height����
class Student extends Person{
	String major;
	public void study() {
		System.out.println("ѧϰ����Сʱ");
	}
	public Student(String name,int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	//����һ���յĶ�������ϵͳ���������޷���
	public Student() {
		
	}
}