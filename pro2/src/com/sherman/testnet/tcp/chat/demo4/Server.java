package com.sherman.testnet.tcp.chat.demo4;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * ����������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * @author Auser
 *
 */

public class Server {
	List<DataServer> all = new ArrayList<DataServer>();
	public static void main(String[] args) throws IOException {
		new Server().ServerStart();
		
	}
	private void ServerStart() throws IOException {
		ServerSocket ss = new ServerSocket(8085);
		while(true) {
		Socket client = ss.accept();
		long i = 1;
		DataServer dataserver = new DataServer(client);
		all.add(dataserver);
		System.out.println("���ǵ�"+i+++"λ�ÿ�");
		new Thread(dataserver).start();
		}
	}
	private class DataServer implements Runnable {
		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;
		private String name;
	
		private DataServer(Socket client) throws IOException {
		
			while(true) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
				this.name = dis.readUTF();
				this.send("��ӭ����������");
				
				
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				//e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dos,dis);
			}
			}
		}
		public String recieve() {
			String msg = null;
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				isRunning = false;
				all.remove(this); //�Ƴ�����
				CloseUtil.closeAll(dos,dis);
			}
			if(msg == null||msg.equals("")) {
				return "���Ϊ��"; 
			}
			return msg;
		}
		public void send(String msg) {
			if(msg==null||msg.equals("")) {
				return ;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				CloseUtil.closeAll(dos);
				all.remove(this);
				isRunning = false;
			}
		}
		public void sendOthers(String msg) {
			for(DataServer other:all) {
				if(other==this) {
					continue;
				}
				other.send(msg);
			}
		}
	
		@Override
		public void run() {
			// TODO �Զ����ɵķ������
			while(isRunning) {
				send(recieve());
				sendOthers(recieve());
			}
		}
		
	}
	
}


//public class Server {
//	private List<MyChannel> all = new ArrayList<MyChannel>();
//	/**
//	 * @param args
//	 * @throws IOException 
//	 */
//	public static void main(String[] args) throws IOException {
//		new Server().start();	
//		
//	}
//	
//	public void start() throws IOException{
//		ServerSocket server =new ServerSocket(9999);
//		while(true){
//			Socket client =server.accept();		
//			MyChannel channel = new MyChannel(client);
//			all.add(channel);//ͳһ����
//			new Thread(channel).start(); //һ����·
//		}
//	}
//	
//	
//	/**
//	 * һ���ͻ��� һ����·
//	 * 1��������
//	 * 2�������
//	 * 3����������
//	 * 4����������
//	 * @author Administrator
//	 *
//	 */
//	private class MyChannel implements Runnable{
//		private DataInputStream dis ;
//		private DataOutputStream dos ;
//		private boolean isRunning =true;
//		private String name; 
//		public MyChannel(Socket client ) {
//			try {
//				dis = new DataInputStream(client.getInputStream());
//				dos = new DataOutputStream(client.getOutputStream());				
//				this.name =dis.readUTF();				
//				this.send("��ӭ������������");
//				sendOthers(this.name+"������������",true);
//			} catch (IOException e) {
//				//e.printStackTrace();
//				CloseUtil.closeAll(dis,dos);
//				isRunning =false;
//			}
//		}
//		/**
//		 * ��ȡ����
//		 * @return
//		 */
//		private String receive(){
//			String msg ="";
//			try {
//				msg=dis.readUTF();
//			} catch (IOException e) {
//				//e.printStackTrace();
//				CloseUtil.closeAll(dis);
//				isRunning =false;
//				all.remove(this); //�Ƴ�����
//			}
//			return msg;
//		}
//		
//		/**
//		 * ��������
//		 */
//		private void send(String msg){
//			if(null==msg ||msg.equals("")){
//				return ;
//			}
//			try {
//				dos.writeUTF(msg);
//				dos.flush();
//			} catch (IOException e) {
//				//e.printStackTrace();
//				CloseUtil.closeAll(dos);
//				isRunning =false;
//				all.remove(this); //�Ƴ�����
//			}
//		}
//		
//		/**
//		 * ���͸������ͻ���
//		 */
//		private void sendOthers(String msg,boolean sys){
//			//�Ƿ�Ϊ˽�� Լ��
//			if(msg.startsWith("@")&& msg.indexOf(":")>-1 ){ //˽��
//				//��ȡname
//				String name =msg.substring(1,msg.indexOf(":"));
//				String content = msg.substring(msg.indexOf(":")+1);
//				for(MyChannel other:all){
//					if(other.name.equals(name)){
//						other.send(this.name+"�������ĵ�˵:"+content);
//					}
//				}
//			}else{		
//				//��������
//				for(MyChannel other:all){
//					if(other ==this){
//						continue;
//					}
//					if(sys){ //ϵͳ��Ϣ
//						other.send("ϵͳ��Ϣ:"+msg);
//					}else{
//						//���������ͻ���
//						other.send(this.name+"��������˵:"+msg);
//					}
//				}
//			}
//		}
//		
//		
//		@Override
//		public void run() {
//			while(isRunning){
//				sendOthers(receive(),false);
//			}
//		}
//	}
//	
//
//}