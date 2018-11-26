
//测试if语句

public class TestIf {
	public static void main (String[] args) {
		double d = Math.random(); //返回【0,1】之间的任意数
		System.out.println(d);
		System.out.println((int)(6*Math.random()+1));//之筛子
		
		int i = (int)(6*Math.random()+1);
		System.out.println(i);
		if(i<=3) {
			System.out.println("小");
		}
		else {
			System.out.println("大");
		}
		 
		
	}

}
