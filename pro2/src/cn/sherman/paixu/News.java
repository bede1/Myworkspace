package cn.sherman.paixu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *��������ӿ�
 * @author Auser
 *
 */
public class News {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("�����������",100,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("�����������",40,new Date(System.currentTimeMillis()+1000*60*60*4)));
		news.add(new NewsItem("����������ӭ��",199,new Date(System.currentTimeMillis()+1000*60*60*4)));
		System.out.println("����ǰ   "+news.toString());
		//System.out.println(news.toString());
		Utils.sort(news);
		System.out.println("����ǰ��  "+news.toString());

		
	}
}
