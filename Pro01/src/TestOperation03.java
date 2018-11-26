
public class TestOperation03 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		
		boolean b3 = 1>2&&2<(3/1);
		System.out.println(b3);
		int a = 4;
		System.out.println(a<<1);
		System.out.println(a<<2);
		System.out.println(~a);
	}

}
