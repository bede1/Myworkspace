/**
 * 
 * @author pc
 *���Եݹ飺�׳�
 */
public class TestRecursion {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.println("�׳˵Ľ��"+ factorial(10));


			
	}
	static long factorial(int n) {
		if(n==1) {   //�ݹ�ͷ
			return 1;
			}else {  //�ݹ���
				return n*factorial(n-1);  
			}
	}

		
		
	}
	

