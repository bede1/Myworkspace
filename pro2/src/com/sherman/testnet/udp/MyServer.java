package com.sherman.testnet.udp;
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
/**
 * 定义服务器端
 * 步骤
	1、创建服务端 +端口
 * 2、准备接受容器
 * 3、封装成 包
 * 4、接受数据
 * 5、分析数据  
 * 6、释放
 * @author pc
 *
 */
public class MyServer {
	public static void main(String[] args) throws IOException {
		//1创建服务端+端口
		DatagramSocket server = new DatagramSocket(8888);
		//2准备接收容器
		byte[] container = new byte[1024];
		//3封装成 包 DatagramPacket(byte[] buf, int length) 
		DatagramPacket packet = new DatagramPacket(container, container.length);
		//4接收数据
		server.receive(packet);
		//5 分析数据
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data,0,len));
		//6释放
		server.close();
				
		
		
		
	}
}
