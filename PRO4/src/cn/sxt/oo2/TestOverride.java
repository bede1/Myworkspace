package cn.sxt.oo2;
/**
 * ���Է�������д
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
  //����horse�̳и���vehicle
class Horse extends Vehicle{
	//�Ը����run��������д
	public void run() {
		System.out.println("horse to run�Ը����run��������д");
	}
	public Person whoIsPsg() {
		return new Person();
		}
	}




