package cn.sherman.collection;

import java.util.ArrayList;
import java.util.List;

/** 
 * 定义冒泡算法  排序
 * @author Auser
 *
 */
public class Bubble {
	int i = 0;
	int j = 0;
	int k = 0;
	List<Integer> element = new ArrayList<Integer>();
	
	
	private boolean checkElem() {
		 if(element.size()==0) {
			 return false;
		 }
		 return true;
	}
	
	
	public void BubbleResult() {
		//   90   60   50   100   109   40   20   43  110    
		if(!checkElem()) {
			System.out.println("未输入有效数组，无法进行算法");
		}
		for(i=0;i<element.size()-1;i++) {
			for(k=i+1;k<element.size();k++) {
				if(element.get(i)<element.get(k)) {
					int temp = element.get(i);
					element.set(i, element.get(k));
					element.set(k, temp);
					
				}
			}
		}
		
		for (j=0;j<element.size();j++) {
			System.out.print(element.get(j)+"\t");
		}
	}	
}


