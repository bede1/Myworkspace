/**
 * 
 * @author pc
 *  ���Է�����������ʹ��
 */
public class Test20 {
	public static void main(String[]args) {
		//ͨ�����������ͨ����
		Test20 tm =new Test20();   //����ΪTest20
		tm.printSxt();
		tm.printSxt();
		tm.add(40, 20, 10);
	}
	void printSxt() {
		System.out.println("���Դ�ӡ����");
	}
	//���Ա��Ƽӷ��ķ���
	void add(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
}
