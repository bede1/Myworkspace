package cn.sherman.generics;
/**
 * 测试泛型接口
 * @author Auser
 *
 */
public interface TestInterfaceGen<T> {
	void test(T a);   //泛型可定义在接口方法中
	//T  b ;  ---->不可定义在接口全局变量中。
}
//声明子类制定具体类型
class Test1 implements TestInterfaceGen<Integer>{

	@Override
	public void test(Integer a) {
		// TODO 自动生成的方法存根
		
	}
	
}
//擦除
class Test2 implements TestInterfaceGen{
	@Override
	public void test(Object a) {
		
	}
}
//父类擦除，子类泛型
class Test3<T> implements TestInterfaceGen{

	@Override
	public void test(Object a) {
		// TODO 自动生成的方法存根
	}
}

class Test4<T> implements TestInterfaceGen<T>{

	@Override
	public void test(T a) {
		// TODO 自动生成的方法存根
		
	}
	
}
