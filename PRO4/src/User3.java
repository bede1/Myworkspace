/**
 * 
 * @author pc
 *测试静态初始化块
 */
public class User3 {
	int id; //id
	String name;  //账户名
	String pwd; //密码
	static String company;  //公司名称
	//静态块
	static {
		System.out.println("执行类的初始化工作");
		company= "北京用友";
		printCompany();
		}
	User3(int id, String name ){
		this.id = id;
		this.name = name;
	}
	public static void printCompany() {
		System.out.println(company);
	}
	public static void main(String[] args) {
		User3 u3= new User3(100,"高见");
		System.out.println(u3.id+"%%%"+u3.name);
	}
	
}
