package cn.sherman.paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����collections������
 * @author Auser
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		//����54����
		List<Integer> cards = new ArrayList<Integer>();
		for (int i = 0;i<54;i++) {
			cards.add(i);
		}
		Collections.shuffle(cards);
		
		
	}
}
