

//���Ի�ȡ��������scanner
import java.util.Scanner;
public class TestScanner {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name =scanner.nextLine();
		System.out.println("�����밮��");
		String favor = scanner.nextLine();
		System.out.println("�������������");
		byte age = scanner.nextByte();
		
		System.out.println("--------------");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
		
		
	}
	

}
