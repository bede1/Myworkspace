package com.sherman.testnet.tcp.chat.demo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器
 * 写出数据：输出流
 * 读取数据：输入流
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
	dos.writeUTF("服务器发送消息"+msg);
	dos.writeUTF("欢迎访问服务器"+"，这是第"+i+++"位访客！！");
	dos.flush();
	}
	}
	}
}
