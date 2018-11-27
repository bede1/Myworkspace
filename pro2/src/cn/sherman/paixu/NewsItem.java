package cn.sherman.paixu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsItem implements java.lang.Comparable<NewsItem> {
	//新闻标题
	private String title;
	//新闻点击量
	private int hits;
	//新闻发布时间
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
		//对时间的比较
		result = this.newsdate.compareTo(o.newsdate);   //升序
		//两个时间相同
		if (result==0) {
			//按照点击量来进行排序
			result = -this.hits-o.hits;   //降序
			//如果点击量也相同，根据
			if(result==0) {
				result = this.title.compareTo(o.title);
			}
		}
		return result;
	}
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("标题: ").append(this.title);
		st.append("__点击量: ").append(this.hits);
		st.append("__发布时间: ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.newsdate)).append("\n");
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
