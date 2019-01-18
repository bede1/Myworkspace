package com.sherman.testnet.tcp.chat.demo2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * ���������߳�
 * @author Auser
 *
 */
public class Send implements Runnable{
	//����̨������
	private BufferedReader console;
	private DataOutputStream dos;
	private boolean isRunning = true;
	public Send() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket client) throws IOException {
		this();
		dos = new DataOutputStream(client.getOutputStream());
		//isRunning = false;
		//CloseUtil.closeAll(dos,console);
	}
	
	
	public void send() throws IOException {
		String msg = console.readLine();
		if(msg!=null) {
			dos.writeUTF(msg);
			dos.flush();
			//isRunning = false;
			//CloseUtil.closeAll(dos,console);
		}
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(isRunning) {
			try {
				send();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	
}
