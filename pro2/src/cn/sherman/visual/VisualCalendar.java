package cn.sherman.visual;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ���Կ��ӻ�����
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
			calendar.set(Calendar.DATE,1);  //ȡ�Ǹ��µĵ�һ��
			//System.out.println(calendar);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			// ��ʼ����һ�ܵ�����ǰӦ�ô�Ŀո���
			for (int i = 1;i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print("\t");
			}
			int j = calendar.get(Calendar.DAY_OF_WEEK)-1;  //�𵽼������Ĺ���
				for (int i = 1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
				System.out.print(i+"\t");
				j++;
				if(j%calendar.get(Calendar.SATURDAY)==0) {
					System.out.print("\n");
				}
			}
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}
}
