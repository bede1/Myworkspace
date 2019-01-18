package com.sherman.testnet.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建多线程客户端
 * @author Auser
 *
 */
public class MultiServer {
	public static void main(String[] args) throws IOException {
		//1.创建服务端并指定端口
		ServerSocket ss = new ServerSocket(8081);
		//2.接收连接
		while(true) {
		Socket skt = ss.accept();
		System.out.println("创建服务器端连接");
		System.out.println("这是来自"+skt.getInetAddress()+"的请求");
		//3.发送数据
		String str  = "欢迎来到西部世界";
		DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
		dos.writeUTF(str);
		dos.flush();
		}		
	}
}
