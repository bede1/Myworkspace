package com.sherman.testnet.tcp.chat.demo1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �����ͻ���: ��������+��������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * 
    ������ ������� ��ͬһ���߳��� Ӧ�� ���������˴˶���
 * @author Auser
 *
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		while(true) {
		Socket client = new Socket("localhost",8082);
		//����̨������
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
			String info = console.readLine();
			//�����
			dos.writeUTF(info);
			dos.flush();
			//������
			String msg = dis.readUTF();
			System.out.println(msg);
		}
	}
}
