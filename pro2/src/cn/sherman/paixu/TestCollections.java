package cn.sherman.paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试collections工具类
 * @author Auser
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		//定义54张牌
		List<Integer> cards = new ArrayList<Integer>();
		for (int i = 0;i<54;i++) {
			cards.add(i);
		}
		Collections.shuffle(cards);
		
		
	}
}
