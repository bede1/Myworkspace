package com.sherman.testnet.tcp.chat.demo1;

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
		ServerSocket ssct = new ServerSocket(8082);
		String msgout = new String("欢迎访问sherman的服务器");
		long i = 1;
		while(true) {
		Socket skt = ssct.accept();
		//输入流
		DataInputStream dis = new DataInputStream(skt.getInputStream());
		String clientstr = dis.readUTF();
		System.out.println("服务器连接成功");
		System.out.println(clientstr);
		//输出流
		DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
		dos.writeUTF(msgout+",这是第"+i+++"位访客");
		dos.flush();
		}
	}
}
