package cn.sxt.arrays;
/**
 * 测试数组的遍历
 * @author pc
 *
 */
public class Test03 {
	public static void main(String[]args) {
		int[] a = new int[4];
		//初始化数据元组的值
		for(int i =0;i<a.length;i++) {
			a[i]= i*10;
			
		}
		//读取元素的值
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	System.out.println("##########");
	//for-each循环用于读取数组元组的值，不能修改元素的值
	for(int m:a){
		System.out.println(m);
	}
}
}
