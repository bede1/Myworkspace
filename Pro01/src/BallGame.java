
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	//��ȡͼƬ
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x=100;   //����С�������
	double y=100;     //����С��������
	boolean right =true;  //����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ���һ��");
		g.drawImage(table, 0, 0, null);
		g.drawImage(ball,(int)x, (int)y, null);
		if(right) { 
		x = x + 10;
		}
		else
		{
			x = x-10;
			
		}
		if (x>1200-60)   //1200���ڳ��ȣ�60 ���߿��
		{ 
			right = false;
		}
		if(x<0+60)    //60���߿��
		{
			right = true;
		}
		
	}
	
	
	//���ڼ���
	void launchFrame() {
		setSize(1200,500);  //c���ڴ�С
		setLocation(50,50);
		setVisible(true);
		//�ػ�����,ÿ�뻭25��
		while(true) {
			repaint();
			try {
			Thread.sleep(40);  //40ms,��Լһ�뻭25�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//main �����ǳ���ִ�е����
	public static void main (String[] args) {
		System.out.println("This is a test program for sherman ,also a game");
		BallGame game =new BallGame();
		game.launchFrame();
	}
		
}
