package cn.bjsxt.oop.testInterface;
/**
 * ���ԽӿڵĶ�̳�
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