package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 测试处理流02（结合字节流ByteArray）
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
		//选择流
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new ByteArrayInputStream(src)));
		//操作   读取的顺序与写出的顺序一致
		//String str1 = dis.readUTF();  // 顺序与write顺序不一致会导致乱码
		long long1 = dis.readLong();
		String str1 = dis.readUTF();
		int it1 = dis.readInt();
		dis.close();
		System.out.println(long1+"####"+str1+"#####"+it1);
		
	}
	
	
	public static byte[] write() throws IOException {
		//定义目标数据
		byte[] dest = null;
		long long1 = 1022L;
		String str1 = "使用字节流进行处理流";
		int it1 = 89;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(bos));
		try {
			dos.writeLong(long1);
			dos.writeUTF(str1);
			dos.writeInt(it1);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		dos.flush();
		dest = bos.toByteArray();
		dos.close();
		
		return dest;
		
	}
	
}
