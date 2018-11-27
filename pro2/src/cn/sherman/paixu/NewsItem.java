package cn.sherman.paixu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsItem implements java.lang.Comparable<NewsItem> {
	//���ű���
	private String title;
	//���ŵ����
	private int hits;
	//���ŷ���ʱ��
	private Date newsdate;
	
	public NewsItem(String title,int hits,Date newsdate) {
		super();
		this.title = title;
		this.hits = hits;
		this.newsdate = newsdate;
	}
	@Override
	public int compareTo(NewsItem o) {
		int result = 0;
		//��ʱ��ıȽ�
		result = this.newsdate.compareTo(o.newsdate);   //����
		//����ʱ����ͬ
		if (result==0) {
			//���յ��������������
			result = -this.hits-o.hits;   //����
			//��������Ҳ��ͬ������
			if(result==0) {
				result = this.title.compareTo(o.title);
			}
		}
		return result;
	}
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("����: ").append(this.title);
		st.append("__�����: ").append(this.hits);
		st.append("__����ʱ��: ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.newsdate)).append("\n");
		return st.toString();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getNewsdate() {
		return newsdate;
	}
	public void setNewsdate(Date newsdate) {
		this.newsdate = newsdate;
	}
	

}
