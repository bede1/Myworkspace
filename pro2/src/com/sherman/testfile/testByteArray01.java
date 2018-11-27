package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ����� �ڵ���
 * ����ĳ������� ������������ܴ�
 * 
 * �ļ����ݲ���̫��
 * 1���ļ�  --����->�ֽ�����
 * 2���ֽ�����  --����->�ļ�
 * @author Auser
 *
 */
public class testByteArray01 {
	public static void main(String[] args) throws IOException {
		read(write());
		
		
	}
	public static byte[] write() throws IOException {
		//����Ŀ�ĵ�
		byte[] dest;
		//ѡ����
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//���� д��
		String msg = "�������������ֽ�������";
		byte[] info = msg.getBytes();
		bos.write(info, 0, info.length);
		dest = bos.toByteArray();
		bos.close();
		return dest;
	}
	public static void read(byte[] src) throws IOException {
		//��������Դ
		//String msg = "�������������ֽ�������";
		//byte[] src = msg.getBytes();
		//ѡ����
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//����
		byte[] flush = new byte[256];
		int len = 0;
		while(-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
		//�ͷ���Դ
		is.close();
		
		
	}
	
}