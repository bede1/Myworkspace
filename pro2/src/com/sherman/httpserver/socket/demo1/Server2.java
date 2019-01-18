package com.sherman.httpserver.socket.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��ץȡpost����
 * @author Auser
 *
 */
public class Server2 {
	private ServerSocket ss;
	public static void main(String[] args) {
		
		Server2 server = new Server2();
		server.start();
		server.recieve();
	
	}
	/**
	 * ����
	 */
	private void start() {
		try {
			ss = new ServerSocket(8090);
//			this.recieve();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	private void recieve() {
		try {
			Socket client = ss.accept();	
			byte[] bt = new byte[10240];
			int len = client.getInputStream().read(bt);
			String info = new String(bt,0,len);
			System.out.println(info);
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
/**
 * ����������
 * @throws IOException 
 */
	private void stop() throws IOException {
		ss.close();
	}
	
}
