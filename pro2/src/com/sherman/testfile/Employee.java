package com.sherman.testfile;
/**\
 * 用于测试对象处理流的一个调用类
 * @author Auser
 *
 */
public class Employee implements java.io.Serializable{
	private transient String name;   //有transient属性，不会被序列化
	private double salary;
	public Employee() {
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
