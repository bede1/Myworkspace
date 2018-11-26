package cn.bjsxt.oop.testInterface;
/**
 * 测试接口
 * @author pc
 *
 */


public interface MyInterface {
	//接口中只有：常量、抽象方法
	String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	public void test01();  //接口中的方法必须是public ，不能使用private
	public int test02(int a, int b);
	
	
}
