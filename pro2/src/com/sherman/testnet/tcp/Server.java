package com.sherman.testnet.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��������������������
 * 1.������������ָ���˿� ServerSocket(int port) 
 * 2.���տͻ�������
 * 3.��������+��������
 * @author Auser
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//1.����������  ָ���˿�
		ServerSocket server = new ServerSocket(8080);
		//2.���տͻ�������  ����ʽ
		Socket sck = server.accept();
		System.out.println("���������ӳɹ�");
		
		//3.��������
		String msg = new String("������ҳ");
		DataOutputStream dos = new DataOutputStream(sck.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//dos.close();  �����Ϊһֱ��Ч��������close����

	}

}
