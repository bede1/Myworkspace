package cn.bjsxt.oop.testInterface;
/**
 * 测试接口
 * @author pc
 *
 */
public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void fly();
	
}
//定义第二个接口attack
interface Attack{
	void attack();
}


class Plane	implements Flyable{
	
	public void fly() {
		System.out.println("使用飞机完成具备飞行的能力");
	}
}
class Man implements Flyable{
	public void fly() {
		System.out.println("跳楼也符合飞行的要求");
	}
}
//一个类可以实现多个接口
class Stone implements Flyable,Attack{
	public void fly() {
	System.out.println("使劲扔也算飞行");

	}
	

	public void attack() {
		System.out.println("石头也是攻击的一种方式");
		
	}
	
}