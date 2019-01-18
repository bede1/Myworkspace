package com.sherman.testnet.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 先启动服务器，后连接
 * 1.创建服务器并指定端口 ServerSocket(int port) 
 * 2.接收客户端连接
 * 3.发送数据+接收数据
 * @author Auser
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//1.创建服务器  指定端口
		ServerSocket server = new ServerSocket(8080);
		//2.接收客户端连接  阻塞式
		Socket sck = server.accept();
		System.out.println("服务器连接成功");
		
		//3.接收数据
		String msg = new String("进入首页");
		DataOutputStream dos = new DataOutputStream(sck.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//dos.close();  服务端为一直生效，不调用close方法

	}

}
