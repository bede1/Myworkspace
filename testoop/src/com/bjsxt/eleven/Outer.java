package com.bjsxt.eleven;

import com.bjsxt.eleven.Face.Nose;

/**
 * 测试内部类
 * @author pc
 *
 */
public class Outer {
	public static void main (String[] args) {
		//Nose n = new Nose();   //不可以直接构造内部类，必须寄存在外部类对象中
		Face f = new Face();
		//两种实例化内部类的方法
		Nose n = f.new Nose();  //方法1
		Face.Nose m = f.new Nose();  //方法2
		//Nose m = new Face.new Nose();
		n.breath();
		//静态类的实例化方法
		Face.Ear e = new Face.Ear();  
		e.listen();
	}

}

class Face{
	int type;
	static String color = "红";
	//定义非静态内部类
	class Nose{
		String type;
		void breath() {
			System.out.println(Face.this.type);  //访问外部类变量
			System.out.println("呼吸");
		}
	}
	
	static class Ear{
		void listen() {
			System.out.println(Face.color);    //静态内部类访问外部类变量.
			//System.out.println(Face.type);  //静态内部类
		}
	}
}