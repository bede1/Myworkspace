package com.sherman.testnet.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  1、创建客户端   必须指定服务器+端口    此时就在连接
 	Socket(String host, int port) 
 2、接收数据 +发送数据	
 * @author Administrator
 * @author Auser
 *
 */
public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建客户端 并指定端口号
		Socket socket = new Socket("localhost",8081);
		//2.接收数据
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String str = dis.readUTF();
		System.out.println(str);		
	}
}
