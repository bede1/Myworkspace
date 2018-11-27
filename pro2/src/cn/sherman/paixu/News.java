package cn.sherman.paixu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *测试排序接口
 * @author Auser
 *
 */
public class News {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("这是早间新闻",100,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("这是午间新闻",40,new Date(System.currentTimeMillis()+1000*60*60*4)));
		news.add(new NewsItem("新闻联播欢迎你",199,new Date(System.currentTimeMillis()+1000*60*60*4)));
		System.out.println("排序前   "+news.toString());
		//System.out.println(news.toString());
		Utils.sort(news);
		System.out.println("排序前后  "+news.toString());

		
	}
}
