package com.sherman.testnet.tcp.chat.demo1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * @author Auser
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ssct = new ServerSocket(8082);
		String msgout = new String("��ӭ����sherman�ķ�����");
		long i = 1;
		while(true) {
		Socket skt = ssct.accept();
		//������
		DataInputStream dis = new DataInputStream(skt.getInputStream());
		String clientstr = dis.readUTF();
		System.out.println("���������ӳɹ�");
		System.out.println(clientstr);
		//�����
		DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
		dos.writeUTF(msgout+",���ǵ�"+i+++"λ�ÿ�");
		dos.flush();
		}
	}
}
