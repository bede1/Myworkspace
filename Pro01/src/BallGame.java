
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	//获取图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x=100;   //定义小球横坐标
	double y=100;     //定义小球中坐标
	boolean right =true;  //方向
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画一次");
		g.drawImage(table, 0, 0, null);
		g.drawImage(ball,(int)x, (int)y, null);
		if(right) { 
		x = x + 10;
		}
		else
		{
			x = x-10;
			
		}
		if (x>1200-60)   //1200窗口长度，60 桌边宽度
		{ 
			right = false;
		}
		if(x<0+60)    //60桌边宽度
		{
			right = true;
		}
		
	}
	
	
	//窗口加载
	void launchFrame() {
		setSize(1200,500);  //c窗口大小
		setLocation(50,50);
		setVisible(true);
		//重画窗口,每秒画25次
		while(true) {
			repaint();
			try {
			Thread.sleep(40);  //40ms,大约一秒画25次窗口
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//main 方法是程序执行的入口
	public static void main (String[] args) {
		System.out.println("This is a test program for sherman ,also a game");
		BallGame game =new BallGame();
		game.launchFrame();
	}
		
}
