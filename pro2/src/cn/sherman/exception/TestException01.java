package cn.sherman.exception;
/**
 * �����쳣����01
 * @author Auser
 *
 */
public class TestException01 {
	public static void main(String[]args) {
		int i = 1/0;
		try {
			Thread.sleep(3000);   //����ֹͣ3����
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
