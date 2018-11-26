/**
 * 
 * @author pc
 *²âÊÔµÝ¹é£º½×³Ë
 */
public class TestRecursion {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.println("½×³ËµÄ½á¹û"+ factorial(10));


			
	}
	static long factorial(int n) {
		if(n==1) {   //µÝ¹éÍ·
			return 1;
			}else {  //µÝ¹éÌå
				return n*factorial(n-1);  
			}
	}

		
		
	}
	

