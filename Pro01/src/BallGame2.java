
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{
	//获取图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x=100;   //定义小球横坐标
	double y=100;     //定义小球中坐标
	double degree = 3.14/3;  //弧度，此处是60度
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画一次");
		g.drawImage(table, 0, 0, null);
		g.drawImage(ball,(int)x, (int)y, null);
		x =x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		
		//球碰到上下边界
		if (y >510||y < 30)
			degree = -degree;
		//球碰到左右边界
		if (x<40||x>1156-40)
			degree = 3.14-degree;
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
		BallGame2 game =new BallGame2();
		game.launchFrame();
	}
		
}
