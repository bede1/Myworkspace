

//测试获取键盘输入scanner
import java.util.Scanner;
public class TestScanner {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String name =scanner.nextLine();
		System.out.println("请输入爱好");
		String favor = scanner.nextLine();
		System.out.println("请输入你的年龄");
		byte age = scanner.nextByte();
		
		System.out.println("--------------");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
		
		
	}
	

}
