package com.sherman.testnet.tcp.chat.demo3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sherman.testnet.tcp.chat.demo3.Receive;

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
		Socket client = new Socket("localhost",8084);
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}
}
