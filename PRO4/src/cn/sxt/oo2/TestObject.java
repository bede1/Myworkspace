package cn.sxt.oo2;
/**
 * 测试object类
 * @author pc
 *
 */
public class TestObject {
	public static void main(String[]args) {
		TestObject to = new TestObject();
		System.out.println(to.toString());
	}
	//重写Object类的toString方法
	public String toString() {
		return "测试Object对象";
	}
}
