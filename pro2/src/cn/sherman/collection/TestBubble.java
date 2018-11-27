
package cn.sherman.collection;
/**
 * 测试调用自定义的bubble类
 * @author Auser
 *
 */
public class TestBubble {
	//   90   60   50   100   109   40   20   43  110    
	public static void main(String[] args) {
		int[] list = {90,60,50,100,109,40,20,43,110};
		Bubble test = new Bubble();
		for(int i = 0;i<list.length;i++) {
			test.element.add(i, list[i]);
		}
		System.out.print(test.element+"\n");
		test.BubbleResult();
		String str = new String();
		//str.compareTo(anotherString);
	}
}
