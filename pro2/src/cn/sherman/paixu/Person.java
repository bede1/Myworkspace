package cn.sherman.paixu;
/**
 * ����
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
		return "������" +this.name+"ָ��"+this.handsome+"\n";
	}
	
	public String getName() {
		return name;
	}
	public int getHandsome() {
		return handsome;
	}
	@Override
	public int compareTo(Person arg0) {
		//Ĭ�ϰ�������
		return this.handsome-arg0.handsome;
	}
	
}
