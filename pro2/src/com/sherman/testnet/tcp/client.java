package com.sherman.testnet.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  1�������ͻ���   ����ָ��������+�˿�    ��ʱ��������
 	Socket(String host, int port) 
 2���������� +��������	
 * @author Administrator
 * @author Auser
 *
 */
public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.�����ͻ��� ��ָ���˿ں�
		Socket socket = new Socket("localhost",8081);
		//2.��������
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String str = dis.readUTF();
		System.out.println(str);		
	}
}
