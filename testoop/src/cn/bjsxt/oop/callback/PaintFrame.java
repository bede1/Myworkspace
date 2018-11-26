package cn.bjsxt.oop.callback;
/**
 * ���Իص�
 * @author pc
 *
 */
public class PaintFrame {
	public static void drawFrame(MyFrame f) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣ��");
		//������
		f.paint();  //���Ӻ������ص�  Ҳ��Ϊģ�巽��ģʽ
		System.out.println("�������棬����Ч��");
	}
	public static void main(String[]args) {
		drawFrame(new GameFrame02());
	}
}

class GameFrame01 extends MyFrame{
	public void paint() {
		System.out.println("GameFrame01.paint()");
		System.out.println("������");
	}
}

class GameFrame02 extends MyFrame{
	public void paint() {
		System.out.println("GameFrame02.paint()");
		System.out.println("������2");
	}
}