package com.sherman.testnet.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �������߳̿ͻ���
 * @author Auser
 *
 */
public class MultiServer {
	public static void main(String[] args) throws IOException {
		//1.��������˲�ָ���˿�
		ServerSocket ss = new ServerSocket(8081);
		//2.��������
		while(true) {
		Socket skt = ss.accept();
		System.out.println("����������������");
		System.out.println("��������"+skt.getInetAddress()+"������");
		//3.��������
		String str  = "��ӭ������������";
		DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
		dos.writeUTF(str);
		dos.flush();
		}		
	}
}
