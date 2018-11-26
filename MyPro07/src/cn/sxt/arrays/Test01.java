package cn.sxt.arrays;
/**
 * 测试数组
 * @author pc
 *
 */

public class Test01 {
	public static void main(String[]args) {
		int[] arr01 =new int[10];  //数组的声明
		String arr02[]=new String[5]; //数组的声明另一种格式
		User1[] arr03=new User1[3];  //用类进行数组的声明
		arr01[0]=11; //数组的实例化
		arr01[1]=13; //数组的实例化
		
		for(int i=2;i<arr01.length;i++) {
			arr01[i]=11*i;
		}
		System.out.println(arr01[9]);
	
		arr03[0] = new User1(1001,"sherman");
		arr03[1] = new User1(1002,"sherman2");
		arr03[2] = new User1(1003,"sherman3");
		System.out.println(arr03[1].getName());
	}
}
 class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
		// TODO 自动生成的构造函数存根
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
	


}