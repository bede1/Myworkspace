package cn.sxt.arrays;
/**
 * ��������ı���
 * @author pc
 *
 */
public class Test03 {
	public static void main(String[]args) {
		int[] a = new int[4];
		//��ʼ������Ԫ���ֵ
		for(int i =0;i<a.length;i++) {
			a[i]= i*10;
			
		}
		//��ȡԪ�ص�ֵ
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	System.out.println("##########");
	//for-eachѭ�����ڶ�ȡ����Ԫ���ֵ�������޸�Ԫ�ص�ֵ
	for(int m:a){
		System.out.println(m);
	}
}
}
