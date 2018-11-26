package cn.sherman.comparable;

import java.util.Date;

/**
 * 用来测试comparable接口及方法
 * @author pc
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem> {
	private String title;
	private int hits;
	private Date pubTime;
	@Override
	public int compareTo(NewsItem arg0) {
		// TODO 自动生成的方法存根
		return 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
}
