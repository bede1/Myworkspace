package cn.bjsxt.oop.testInterface;
/**
 * ���Խӿ�
 * @author pc
 *
 */
public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void fly();
	
}
//����ڶ����ӿ�attack
interface Attack{
	void attack();
}


class Plane	implements Flyable{
	
	public void fly() {
		System.out.println("ʹ�÷ɻ���ɾ߱����е�����");
	}
}
class Man implements Flyable{
	public void fly() {
		System.out.println("��¥Ҳ���Ϸ��е�Ҫ��");
	}
}
//һ�������ʵ�ֶ���ӿ�
class Stone implements Flyable,Attack{
	public void fly() {
	System.out.println("ʹ����Ҳ�����");

	}
	

	public void attack() {
		System.out.println("ʯͷҲ�ǹ�����һ�ַ�ʽ");
		
	}
	
}