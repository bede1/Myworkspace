package com.sherman.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ����IO��
 * @author pc
 *
 */
public class TestIo {
	public static void main (String[] args) {
		//1.������ϵFile����
		File src = new File("D:/testio/a.txt");
		//2.ѡ����
		InputStream is = null;  //����������
		int i=0;
		try {
			is = new FileInputStream(src);
			byte[] car = new byte[1];
			//int len = 0; 
			StringBuilder sb = new StringBuilder();
			while((is.read(car))!=-1) {
				String info = new String(car,0,car.length);
				sb.append(info);
				i++;
			}
			System.out.println(sb.toString());
			System.out.println(i);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�Ҳ����ļ�");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}
		finally {
			try {
				if (is !=null) {
					is.close();
				}
			}catch(Exception e2) {
				System.out.println("�ر��ļ�������ʧ��");
			}
		}
		
	}
}
