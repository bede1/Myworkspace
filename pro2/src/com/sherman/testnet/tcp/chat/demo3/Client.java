package com.sherman.testnet.tcp.chat.demo3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sherman.testnet.tcp.chat.demo3.Receive;

/**
 * 创建客户端: 发送数据+接收数据
 * 写出数据：输出流
 * 读取数据：输入流
 * 
    输入流 与输出流 在同一个线程内 应该 独立处理，彼此独立
 * @author Auser
 *
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost",8084);
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}
}
