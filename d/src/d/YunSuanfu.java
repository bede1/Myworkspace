package d;

public class YunSuanfu {
	public static void main (String[] agrs) {
		
		
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 50;
	int x = 2*++a;
	int y = 2*b++;
	System.out.println("a+b="+(a+b));
	System.out.println("a/3="+(a/3));
	System.out.println("a%b="+(b%d));
	System.out.println("a++="+(a++));
	System.out.println("a--="+(a--));
	System.out.println("a--="+(a));  //a的值继承
	System.out.println("自增后，a="+a+" x="+x);
	System.out.println("自增后，b="+b+"  y="+y);
	System.out.println("b+=c结果为"+(b+=c));
	System.out.println("a-=c结果为"+(a-=c));
	System.out.println("a*=c结果为"+(a*=c));
	System.out.println("a/=c结果为"+(a/=c));
	System.out.println("a%=c结果为"+(a%=c));
	System.out.println("a<<=2结果为"+(a<<=2));//位运算
	System.out.println("a>>=2结果为"+(a>>=2));//位运算
	System.out.println("a&=2结果为"+(a&=2));//位运算
	System.out.println("a^=2结果为"+(a^=2));//位运算
	System.out.println("a|=c结果为"+(a|=c));//位运算
	
	}

}
