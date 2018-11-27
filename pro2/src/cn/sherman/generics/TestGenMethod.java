package cn.sherman.generics;
/**
 *  ≤‚ ‘∑∫–Õ∑Ω∑®
 * @author Auser
 *
 */
public class TestGenMethod {
	public static void main(String[] args) {
		test("123d");
		test2();
		TestGenMethod hh = new TestGenMethod();
		hh.test3(123);
		hh.test("er");
	}
	
	public static<T> void test(T t1) {
		System.out.println(t1);
	}
	public static <T>Boolean test2(){
		return true;
	}
	public  void test3(int t1) {
		System.out.println(t1);
	}
	
}
