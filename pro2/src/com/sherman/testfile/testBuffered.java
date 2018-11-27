package com.sherman.testfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ���Ի�����
 * @author Auser
 *
 */
public class testBuffered {
	public static void main(String[] args) {
		File src = new File("E:\\testfile\\testbuffered\\testbuffer.java");
		File dest = new File("E:\\testfile\\testbuffered\\testbuffer2.xls");
		BufferedReader reader = null;
		BufferedWriter wr = null;
		try {
			reader = new BufferedReader(new FileReader(src));
			wr = new BufferedWriter(new FileWriter(dest));
			String line = null;
			while((line=reader.readLine())!=null) {
				wr.write(line);
				wr.newLine();  //����
			}
			wr.flush();  //ǿ��ˢ��
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("�ļ�д��ʧ��");
		}finally {
			if(null != wr) {
				try {
					wr.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}   //�ر��ļ�
			}
			if(null != reader) {
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