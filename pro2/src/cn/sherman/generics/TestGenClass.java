package cn.sherman.generics;
/**
 * ���Է�����
 * @author Auser
 *
 */
public class TestGenClass<T1,T2> {
	public T1 name;
	private T2 score;   
	//public static T1 test;  ������������ʹ���ھ�̬���Լ���̬������
	//public static void test1(T1 test3) {}
	public T2 getScore() {
		return score;
	}
	public void setScore(T2 score) {
		this.score = score;
	}
	public static void main(String[] args) {
		TestGenClass<String,Integer> test = new TestGenClass<String,Integer>();   //ʹ��ʱָ������
		test.setScore(100);
		int test2 = test.getScore();   
		 System.out.println(test2);
	}
	
}
