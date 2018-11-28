package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ���Դ�����02������ֽ���ByteArray��
 * @author Auser
 *
 */
public class testDataIo02 {
		public static void main(String[] args) throws IOException {
			byte[] data = write();
			read(data);
			System.out.println(data.length);
			String str2 = new String(data,"utf-8");
			System.out.println(str2);
		}
	
	public static void read(byte[] src) throws IOException {
		//ѡ����
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new ByteArrayInputStream(src)));
		//����   ��ȡ��˳����д����˳��һ��
		//String str1 = dis.readUTF();  // ˳����write˳��һ�»ᵼ������
		long long1 = dis.readLong();
		String str1 = dis.readUTF();
		int it1 = dis.readInt();
		dis.close();
		System.out.println(long1+"####"+str1+"#####"+it1);
		
	}
	
	
	public static byte[] write() throws IOException {
		//����Ŀ������
		byte[] dest = null;
		long long1 = 1022L;
		String str1 = "ʹ���ֽ������д�����";
		int it1 = 89;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(bos));
		try {
			dos.writeLong(long1);
			dos.writeUTF(str1);
			dos.writeInt(it1);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		dos.flush();
		dest = bos.toByteArray();
		dos.close();
		
		return dest;
		
	}
	
}
