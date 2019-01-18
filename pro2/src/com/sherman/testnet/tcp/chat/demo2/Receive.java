package com.sherman.testnet.tcp.chat.demo2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 接收数据
 * @author Auser
 *
 */
public class Receive implements Runnable {
	public DataInputStream dis;
	private boolean isRunning = true;
	public Receive() {
		
	}
	public Receive(Socket client) throws IOException {
		dis = new DataInputStream(client.getInputStream());
		//isRunning = false;
		//CloseUtil.closeAll(dis);
	}
	public String receive() throws IOException {
		String msg = "";
		msg=dis.readUTF();
		//isRunning = false;
		return msg;
		
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(isRunning) {
			try {
				System.out.println(receive());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dis);
			
			}
		}
	}

	
}
