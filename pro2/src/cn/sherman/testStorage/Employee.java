package cn.sherman.testStorage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试存储练习-雇员
 * @author Auser
 *
 */
public class Employee {
	private int id;
	private String name;
	private int salary ;
	private String department;
	private Date birthday;
	
	public Employee(int id,String name,int salary,String department,String birthday) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		DateFormat format = new SimpleDateFormat("yyyy-mm");
		try {
			this.birthday = format.parse(birthday);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
}

