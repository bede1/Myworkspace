package cn.sherman.generics;
/**
 * ���Է��ͽӿ�
 * @author Auser
 *
 */
public interface TestInterfaceGen<T> {
	void test(T a);   //���Ϳɶ����ڽӿڷ�����
	//T  b ;  ---->���ɶ����ڽӿ�ȫ�ֱ����С�
}
//���������ƶ���������
class Test1 implements TestInterfaceGen<Integer>{

	@Override
	public void test(Integer a) {
		// TODO �Զ����ɵķ������
		
	}
	
}
//����
class Test2 implements TestInterfaceGen{
	@Override
	public void test(Object a) {
		
	}
}
//������������෺��
class Test3<T> implements TestInterfaceGen{

	@Override
	public void test(Object a) {
		// TODO �Զ����ɵķ������
	}
}

class Test4<T> implements TestInterfaceGen<T>{

	@Override
	public void test(T a) {
		// TODO �Զ����ɵķ������
		
	}
	
}
