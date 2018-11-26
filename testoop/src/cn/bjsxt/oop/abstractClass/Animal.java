package cn.bjsxt.oop.abstractClass;
/**
 * 测试抽象类
 * @author pc
 *
 */
public abstract class Animal {
	public abstract void run() ;   //抽象方法的定义，只有声明，不需要方法体
		
	
}
//子类必须实现抽象方法，否则编译不通过

class Cat extends Animal {
	//对run方法的重写
	public void run() {
		System.out.println("子类必须实现抽象方法，否则编译不通过");
		
	}
	
}