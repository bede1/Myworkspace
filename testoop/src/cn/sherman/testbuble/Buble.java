package cn.sherman.testbuble;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������㷨
 * @author pc
 *
 */
public class Buble {
	int i= 0;
	int j = 0;
	List<Integer> element = new ArrayList<Integer>();
	
	//���element�Ƿ�Ϊ��
	private boolean checkElem() {
		if(element.size()==0) {
			return false;
		}
		return true;
	}
	
	
	public void buble(List element){
		
		if(checkElem()) {
			for(i = 0 ;i<element.size();i++) {
				if((int)element.get(i)>(int)element.get(i+1)) {
					int temp = (int) element.get(i);
					element.set(i, element.get(i+1)) ;
					element.set(i+1,temp);
					
				}
				
				
			}
			// 4   7   3   54   23  55  1  
			
		}
		else
		{
			System.out.println("δ������ʵ�����");
		}
	}
}
