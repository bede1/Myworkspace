/**
 * 
 * @author pc
 *����99�˷���
 */
public class NineTimesTest {
	public static void main(String[]args) {
		for(int i =1;i<=9;i++) {
			for (int j = 1;j<=i;j++) {
				System.out.print(j+"*"+i+" = "+i*j+"  ");
			}
			System.out.println();
		}
	System.out.println("#########################");
	
	int sum1=0;
	int sum2=0;
	for (int a = 1;a<=100;a++) {
		if (a%2==0) {
			sum1 = sum1+a;
		}
		else {
			sum2 = sum2+a;
		}
	}
		System.out.print("100����ż����Ϊ  "+sum2+"   100����������Ϊ"+sum1);
	}
	

}
