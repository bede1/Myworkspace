package cn.sxt.arrays;
/**
 * ��������
 * @author pc
 *
 */

public class Test01 {
	public static void main(String[]args) {
		int[] arr01 =new int[10];  //���������
		String arr02[]=new String[5]; //�����������һ�ָ�ʽ
		User1[] arr03=new User1[3];  //����������������
		arr01[0]=11; //�����ʵ����
		arr01[1]=13; //�����ʵ����
		
		for(int i=2;i<arr01.length;i++) {
			arr01[i]=11*i;
		}
		System.out.println(arr01[9]);
	
		arr03[0] = new User1(1001,"sherman");
		arr03[1] = new User1(1002,"sherman2");
		arr03[2] = new User1(1003,"sherman3");
		System.out.println(arr03[1].getName());
	}
}
 class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
		// TODO �Զ����ɵĹ��캯�����
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}