/**
 * 
 * @author pc
 *���Ծ�̬��ʼ����
 */
public class User3 {
	int id; //id
	String name;  //�˻���
	String pwd; //����
	static String company;  //��˾����
	//��̬��
	static {
		System.out.println("ִ����ĳ�ʼ������");
		company= "��������";
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
		User3 u3= new User3(100,"�߼�");
		System.out.println(u3.id+"%%%"+u3.name);
	}
	
}
