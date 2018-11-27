package cn.sherman.paixu;
/**
 * ����treeset��treemap�����Ĳ�����(ҵ���ࣩ
 * @author Auser
 *
 */
public class Worker implements java.lang.Comparable<Worker>{
	//����
	private final String type;
	//����
	private final String name;
	//����
	private final int salary;
	
	public Worker() {
		//��final��ı������г�ʼ��
		this.type = null;
		this.name = null;
		this.salary = 0;
		}
	
	public Worker(String type,String name,int salary) {
		super();
		this.type = type;
		this.name = name;
		this.salary = salary;
	}
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "����"+this.name+"����"+this.type+"����"+this.salary+"\n";
	}
	//�Թ������������������ʵ��lang���µ�comparable������дcompareTo����
	public int compareTo(Worker o){
		return this.salary>o.salary?1:(this.salary==o.salary?0:-1);
	}

	
	
	
}
