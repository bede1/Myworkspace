package cn.sherman.paixu;
/**
 * 测试
 * @author Auser
 *
 */
public class Person implements java.lang.Comparable<Person> {
	private final String name;
	private final int handsome;
	
	public Person() {
		this.name = null;
		this.handsome = 0;
	}
	public Person(String name,int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public String toString() {
		return "姓名：" +this.name+"指数"+this.handsome+"\n";
	}
	
	public String getName() {
		return name;
	}
	public int getHandsome() {
		return handsome;
	}
	@Override
	public int compareTo(Person arg0) {
		//默认按照升序
		return this.handsome-arg0.handsome;
	}
	
}
