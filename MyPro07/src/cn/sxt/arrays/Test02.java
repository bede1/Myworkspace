package cn.sxt.arrays;
/**
 * 测试数组初始化
 * @author pc
 *
 */
public class Test02 {
	public static void main(String[]args) {
		//静态初始化
		int[] a = {2,3,4,5};  
		User1[] b = {
				new User1(1001,"sherman1"),
				new User1(1002,"sherman2"),
				new User1(1003,"sherman3")
				};
		//默认初始化
		int[] c= new int[3]; //默认给数组赋值，赋值规则与成员变量赋值规则一样
		//动态初始化
		int[] d = new int[2];
		d[0]= 1;
		d[1]=2;
		
	}
}
