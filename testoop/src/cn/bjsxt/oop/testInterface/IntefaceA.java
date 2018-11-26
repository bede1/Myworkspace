package cn.bjsxt.oop.testInterface;
/**
 * 测试接口的多继承
 * @author pc
 *
 */
public interface IntefaceA {
		void aaa();
}

interface InterfaceB{
	void bbb();
}
interface InterfaceC extends IntefaceA, InterfaceB{
	void ccc();
}