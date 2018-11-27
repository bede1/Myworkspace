package cn.sherman.generics;
/**
 * 测试泛型类
 * @author Auser
 *
 */
public class TestGenClass<T1,T2> {
	public T1 name;
	private T2 score;   
	//public static T1 test;  泛型声明不能使用在静态属性及静态方法上
	//public static void test1(T1 test3) {}
	public T2 getScore() {
		return score;
	}
	public void setScore(T2 score) {
		this.score = score;
	}
	public static void main(String[] args) {
		TestGenClass<String,Integer> test = new TestGenClass<String,Integer>();   //使用时指定类型
		test.setScore(100);
		int test2 = test.getScore();   
		 System.out.println(test2);
	}
	
}
