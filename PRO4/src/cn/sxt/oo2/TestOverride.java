package cn.sxt.oo2;
/**
 * 测试方法的重写
 * @author pc
 *
 */
public class TestOverride {
	public static void main(String[]args) {
		Horse h = new Horse();
		h.run();
	}
}
class Vehicle{
	public void run() {
		System.out.println("RUNNING AND RUNNING");
		
	}
	public void stop() {
		System.out.println("need to stop");
	}
	public Person whoIsPsg() {
		return new Person();
	}
}
  //子类horse继承父类vehicle
class Horse extends Vehicle{
	//对父类的run方法的重写
	public void run() {
		System.out.println("horse to run对父类的run方法的重写");
	}
	public Person whoIsPsg() {
		return new Person();
		}
	}




