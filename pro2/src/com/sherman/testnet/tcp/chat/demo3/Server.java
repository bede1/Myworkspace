package com.sherman.testnet.tcp.chat.demo3;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建服务器
 * 写出数据：输出流
 * 读取数据：输入流
 * @author Auser
 *
 */
//public class Server {
//	private List<DataServer> all = new ArrayList<DataServer>();
//	public static void main(String[] args) throws IOException {
//		new Server().start();
//			}
//	public void start() throws IOException {
//		ServerSocket ss = new ServerSocket(8084);
//		long i = 1;
//		while(true) {
//		Socket skt = ss.accept();
//		DataServer ds = new DataServer(skt);
//		all.add(ds);
//		for(int j=0;j<all.size();j++) {
//			new Thread(all.get(j)).start();
//			//all.get(j).send();
//			
//		}
//		
////		for(DataServer ds1:all) {
////			new Thread(ds1).start();
////		}
////		Thread t1 = new Thread(ds);
////		t1.start();
//		System.out.println("这是第"+i+++"位访客");
//	}
//		
//	}
//	public List<DataServer> getList(){
//		return all;
//	}
//}


public class Server {
	private List<MyChannel> all = new ArrayList<MyChannel>();
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new Server().start();	
		
	}
	
	public void start() throws IOException{
		ServerSocket server =new ServerSocket(9999);
		while(true){
			Socket client =server.accept();		
			MyChannel channel = new MyChannel(client);
			all.add(channel);//统一管理
			new Thread(channel).start(); //一条道路
		}
	}
	
	
	/**
	 * 一个客户端 一条道路
	 * 1、输入流
	 * 2、输出流
	 * 3、接收数据
	 * 4、发送数据
	 * @author Administrator
	 *
	 */
	private class MyChannel implements Runnable{
		private DataInputStream dis ;
		private DataOutputStream dos ;
		private boolean isRunning =true;
		public MyChannel(Socket client ) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				//e.printStackTrace();
				CloseUtil.closeAll(dis,dos);
				isRunning =false;
			}
		}
		/**
		 * 读取数据
		 * @return
		 */
		private String receive(){
			String msg ="";
			try {
				msg=dis.readUTF();
			} catch (IOException e) {
				//e.printStackTrace();
				CloseUtil.closeAll(dis);
				isRunning =false;
				all.remove(this); //移除自身
			}
			return msg;
		}
		
		/**
		 * 发送数据
		 */
		private void send(String msg){
			if(null==msg ||msg.equals("")){
				return ;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				//e.printStackTrace();
				CloseUtil.closeAll(dos);
				isRunning =false;
				all.remove(this); //移除自身
			}
		}
		
		/**
		 * 发送给其他客户端
		 */
		private void sendOthers(){
			String msg = this.receive();
			//遍历容器
			for(MyChannel other:all){
				if(other ==this){
					continue;
				}
				//发送其他客户端
				other.send(msg);
			}
		}
		
		
		@Override
		public void run() {
			while(isRunning){
				sendOthers();
			}
		}
	}
	

}

