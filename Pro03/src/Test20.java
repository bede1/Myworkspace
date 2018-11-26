/**
 * 
 * @author pc
 *  测试方法的声明和使用
 */
public class Test20 {
	public static void main(String[]args) {
		//通过对象调用普通方法
		Test20 tm =new Test20();   //对象为Test20
		tm.printSxt();
		tm.printSxt();
		tm.add(40, 20, 10);
	}
	void printSxt() {
		System.out.println("测试打印方法");
	}
	//测试编制加法的方法
	void add(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
}
