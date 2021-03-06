package com.sherman.testthread.createthread;
/**
 * 测试静态代理  设计模式
 * 1.真实角色
 * 2.代理角色 ：须持有真实角色的引用
 * 3.二者  实现相同的接口
 * @author Auser
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//创建真实角色
		You you = new You();
		//创建代理角色+真实角色的引用
		WeddingCompany wc = new WeddingCompany(you);
		wc.Marry();
	}
}
//定义接口
interface Marry{
	public abstract void Marry();
}
class You implements Marry{

@Override
public void Marry() {
	// TODO 自动生成的方法存根
	System.out.println("你和嫦娥结婚了。。。");
	
}
}
class WeddingCompany implements Marry{
	private You yu;
	public WeddingCompany() {
		
	}
	public WeddingCompany(You yu) {
		this.yu = yu;
		
	}
	private static void before() {
		System.out.println("先布置房间");
	}
	private static void after() {
		System.out.println("最后闹洞房");
	}
	@Override
	public void Marry() {
		// TODO 自动生成的方法存根
		before();
		yu.Marry();
		after();
		
		
	}
	
}



