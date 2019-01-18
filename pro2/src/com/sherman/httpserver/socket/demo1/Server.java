package com.sherman.httpserver.socket.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����дһ��server�����ڽ��տͻ������������
 * @author Auser
 *
 */
public class Server {
	private ServerSocket ss;
	public static void main(String[] args) {
		
		Server server = new Server();
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
			String msg = null;
			StringBuilder sb = new StringBuilder();
			String info = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while((msg=br.readLine())!=null) {
				//��������,��ȥ���ո�
				info = sb.append(msg).append("\r\n").toString().trim();  
				//sb.toString().trim()
				
			}
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