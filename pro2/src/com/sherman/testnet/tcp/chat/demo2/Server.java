package com.sherman.testnet.tcp.chat.demo2;

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
	ServerSocket ss = new ServerSocket(8083);
	long i = 1;
	while(true) {
	Socket skt = ss.accept();
	DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
	DataInputStream dis = new DataInputStream(skt.getInputStream());
	while(true) {
	String msg = dis.readUTF();
	dos.writeUTF("������������Ϣ"+msg);
	dos.writeUTF("��ӭ���ʷ�����"+"�����ǵ�"+i+++"λ�ÿͣ���");
	dos.flush();
	}
	}
	}
}
