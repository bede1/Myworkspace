package cn.sherman.exception;
/**
 * 测试异常机制01
 * @author Auser
 *
 */
public class TestException01 {
	public static void main(String[]args) {
		int i = 1/0;
		try {
			Thread.sleep(3000);   //程序停止3秒钟
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
