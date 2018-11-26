/**
 * 
 * @author pc
 *  测试参数传递机制
 */
public class User4 {
	int id;  //ID
	String name; //账户名
	String pwd; //密码
	public User4(int id,String name ) {
		this.id = id;
		this.name =name;
				
	}
	public void testParameterTransfer01(User4 x) {
		x.name = "sherman";
	}
	public void testParameterTransfer02(User4 u) {
		u =new User4(200,"bede1");
	}
	public static void main(String[]args) {
		User4 u1 =new User4(100,"高见");
		System.out.println(u1.name);
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
		User4 u2 = new User4(300,"gaojian");
		System.out.println(u2.name);
		u2.testParameterTransfer02(u2);
		System.out.println(u2.name);

				
	}
}
