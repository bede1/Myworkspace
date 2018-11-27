package cn.sherman.visual;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试可视化日历
 * @author Auser
 *
 */
public class VisualCalendar {
	public static void main(String[]args) {
		String temp="2018-09-06";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(temp);
			//System.out.println(date);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			//System.out.println(calendar);
			calendar.set(Calendar.DATE,1);  //取那个月的第一天
			//System.out.println(calendar);
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			// 初始化第一周的日期前应该打的空格数
			for (int i = 1;i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print("\t");
			}
			int j = calendar.get(Calendar.DAY_OF_WEEK)-1;  //起到计数器的功能
				for (int i = 1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
				System.out.print(i+"\t");
				j++;
				if(j%calendar.get(Calendar.SATURDAY)==0) {
					System.out.print("\n");
				}
			}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
}
