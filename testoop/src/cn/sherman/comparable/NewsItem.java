package cn.sherman.comparable;

import java.util.Date;

/**
 * ��������comparable�ӿڼ�����
 * @author pc
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem> {
	private String title;
	private int hits;
	private Date pubTime;
	@Override
	public int compareTo(NewsItem arg0) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
}
