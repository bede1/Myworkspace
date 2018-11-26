
//测试switch语句
public class TestSwich {
	public static void main(String[] args) {
		int month =(int)( 1+12*Math.random());
		System.out.println("月份："+month);
		switch(month) {
		case 1:
			System.out.println("1月份");
			break;
		case 2:
			System.out.println("2月份");
			break;
		case 3:
			System.out.println("3月份");
			break;
		default:
			System.out.println("其他鱼粉");
		}
	}

}
