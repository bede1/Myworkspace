package cn.sherman.paixu;
/**
 * 测试treeset和treemap创建的测试类(业务类）
 * @author Auser
 *
 */
public class Worker implements java.lang.Comparable<Worker>{
	//工种
	private final String type;
	//姓名
	private final String name;
	//工资
	private final int salary;
	
	public Worker() {
		//对final类的变量进行初始化
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
		return "姓名"+this.name+"工种"+this.type+"工资"+this.salary+"\n";
	}
	//对工资数额进行升序排序，实现lang包下的comparable必须重写compareTo方法
	public int compareTo(Worker o){
		return this.salary>o.salary?1:(this.salary==o.salary?0:-1);
	}

	
	
	
}
