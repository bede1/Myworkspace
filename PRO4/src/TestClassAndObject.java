

/**
 * 
 * @author pc
 *  ������Ͷ���
 */
public class TestClassAndObject {
	//����field
	int id;
	String name;
	int age;
	Computer comp;   //�����
	
	//����
	void study() {
		System.out.println("��Ҫ��֤ѧϰ"+comp.brand);
		
	}
	//����
	void play() {
		System.out.println("������nfs"+"�����ҵĵ���Ʒ����"+comp.brand);
	}
	//�������ڣ�����Ҫ��main����
	public static void main(String[] args) {
		TestClassAndObject stu = new TestClassAndObject();
		stu.id = 1001;
		stu.age = 20;
		stu.name = "sherman";

		Computer c1 = new Computer();
		c1.brand = "thinkpad";
		stu.comp = c1;     //��c1��������Դ�����stu�����comp����
		stu.study();
		stu.play();
	}
	
	
}

class Computer{
	String brand;
	
	
}


