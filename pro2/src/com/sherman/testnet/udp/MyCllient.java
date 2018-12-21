package com.sherman.testnet.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 创建客户端：
 *  1、创建客户端 +端口
 * 2、准备数据
 * 3、打包（发送的地点 及端口）
 * 4、发送
 * 5、释放
 * @author pc
 *
 */
public class MyCllient {
	public static void main(String[] args) throws IOException {
		//1创建客户端+端口
		DatagramSocket client = new DatagramSocket(6666);
		//2准备数据
		String msg = "我这里是来自客户端的信息";
		byte[] data = msg.getBytes();
		//3打包（发送的地点及端口） DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
		//4发送
		client.send(packet);
		//5释放资源
		client.close();
	}
}
