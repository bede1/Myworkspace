package com.sherman.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * �����ַ���
 * @author pc
 *
 */
public class TestCharIo {
	public static void main(String[] args) {
		File src = new File("D:\\testio\\testchar1.txt");
		Reader reader = null;   //��ʼ���ļ���ͬʱ��������null
		try {
			reader = new FileReader(src);
			char[] flush = new char[1024];
			int len = 0;
			while((len=reader.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
				//System.out.println(len);
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
						
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
}
