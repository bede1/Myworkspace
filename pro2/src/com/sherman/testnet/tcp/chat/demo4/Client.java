package com.sherman.testnet.tcp.chat.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		System.out.println("���������ƣ�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		if(name.equals("")){
			return;
		}
		Socket client = new Socket("localhost",8085);
		new Thread(new Send(client,name)).start();
		new Thread(new Receive(client)).start();
	}
}



//public class Client {
//
//	/**
//	 * @param args
//	 * @throws IOException 
//	 * @throws UnknownHostException 
//	 */
//	public static void main(String[] args) throws UnknownHostException, IOException {
//		System.out.println("����������:");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String name = br.readLine();
//		if(name.equals("")){
//			return;
//		}
//		
//		Socket client = new Socket("localhost",9999);
//		new Thread(new Send(client,name)).start(); //һ��·��
//		new Thread(new Receive(client)).start(); //һ��·��
//		
//	}
//
//}