package com.sherman.testnet.tcp.chat.demo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * �Է��������������������������
 * @author Auser
 *
 */
public class DataServer implements Runnable {
	DataInputStream dis ;
	DataOutputStream dos;
	boolean isRunning = true;
	String msg = null;
	public DataServer(Socket Client) {
		try {
			dis = new DataInputStream(Client.getInputStream());
			dos = new DataOutputStream(Client.getOutputStream());
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			//e.printStackTrace();
			CloseUtil.closeAll(dis,dos);
			isRunning = false;
		}
		
	}
	public String recieve() throws IOException {
		
		msg = dis.readUTF();
		return msg;
	}

	public void send() throws IOException {
		
		try {
			dos.writeUTF("�������˷���---->"+recieve());
			dos.flush();
		
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			//e.printStackTrace();
			CloseUtil.closeAll(dis,dos);
			isRunning = false;
		}		
	}
//	public void sendothers() throws IOException {
//		List<DataServer> allclient = new Server().getList();
//		for(DataServer other:allclient) {
//			if(other ==this) {
//				continue;
//			}
//			other.send();
//		}
//		
//	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(isRunning) {
			try {
				//recieve();
				send();
			
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				//e.printStackTrace();
				CloseUtil.closeAll(dis,dos);
				isRunning = false;
			}
		}
	}
			
}
