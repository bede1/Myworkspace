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
	System.out.println("a--="+(a));  //a��ֵ�̳�
	System.out.println("������a="+a+" x="+x);
	System.out.println("������b="+b+"  y="+y);
	System.out.println("b+=c���Ϊ"+(b+=c));
	System.out.println("a-=c���Ϊ"+(a-=c));
	System.out.println("a*=c���Ϊ"+(a*=c));
	System.out.println("a/=c���Ϊ"+(a/=c));
	System.out.println("a%=c���Ϊ"+(a%=c));
	System.out.println("a<<=2���Ϊ"+(a<<=2));//λ����
	System.out.println("a>>=2���Ϊ"+(a>>=2));//λ����
	System.out.println("a&=2���Ϊ"+(a&=2));//λ����
	System.out.println("a^=2���Ϊ"+(a^=2));//λ����
	System.out.println("a|=c���Ϊ"+(a|=c));//λ����
	
	}

}
