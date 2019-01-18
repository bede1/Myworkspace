package com.sherman.testnet.tcp.chat.demo2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 发送数据线程
 * @author Auser
 *
 */
public class Send implements Runnable{
	//控制台输入流
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
		// TODO 自动生成的方法存根
		while(isRunning) {
			try {
				send();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
}
