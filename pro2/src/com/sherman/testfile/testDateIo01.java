package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���Դ�����01
 * �������ͣ�����+String��������
 * 1.������ DataInputStream   readXXXX()
 * 2.�����DataOutputStream   writeXXXX()
 * ������������ʹ�ö�̬
 * java.io.EOFException :û�ж�ȡ����ص�����
 * @author Auser
 *
 */
public class testDateIo01 {
		public static void main(String[] args) throws IOException {
			write("E:\\testfile\\testdataio\\test1.txt");
			read("E:\\testfile\\testdataio\\test1.txt");
		}
	
	public static void read(String outputPath) throws IOException {
		//����Դ
		File src = new File(outputPath);
		//ѡ����
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream(src))
				);
		//����  ��ȡ��˳����д����˳�����һ�£�����һ�£�����ʾ�����ݻ�������⣩��������ڲ��ܶ�ȡ
		//long long2 = dis.readLong();
		double dou1 = dis.readDouble();
		long long1 = dis.readLong();
		String str = dis.readUTF();
		dis.close();
		System.out.println(dou1+"##"+long1+"##"+str);
	}
	
	public static void write(String outputPath) throws IOException {
		double point = 2369;
		long num = 100L;
		String str = "��������";
		File output = new File(outputPath);
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(output))
				);
		//����  д����˳��Ϊ��ȡ��׼��
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
	
}