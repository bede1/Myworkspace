package com.sherman.testfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ���������ļ��ķ���
 * ���岽�裺
 *  1��������ϵ   File����   Դͷ Ŀ�ĵ�
2��ѡ����     
	 �ļ�������  InputStream FileInputStream
	  �ļ������  OutputStream FileOutputStream
3������  :  ����
	 byte[] flush =new byte[1024]; 
	 int len =0;
	  while(-1!=(len=������.read(flush))){  
		 �����.write(flush,0,len)
	  }
             �����.flush
4���ͷ���Դ :�ر� ������
 * @author Auser
 *
 */
public class copyFile {

	public copyFile() {
		
	}
	//ֻ�ǿ����ļ�������·��������
	public void doCopyFile(String srcPath,String destPath) throws IOException {
		//�ϲ���ͬ�Ĵ���
		/*File src = new File(srcPath);
		File dest = new File(destPath);
		//1��������ϵԴ��������Ϊ�ļ���+Ŀ�ĵأ��ļ����Բ����ڣ�
		if(!src.isFile()) {  //�ļ������ڻ��߲����ļ�
			System.out.println("ֻ�ܿ����ļ�");
		}
		try {
			InputStream is = new FileInputStream(src);
			OutputStream os = new FileOutputStream(dest);
			byte[] bt = new byte[1024];
			while(is.read(bt)!=-1) {
				os.write(bt);
			}
			os.flush();
			os.close();
			is.close();
			System.out.println("��ɿ����ļ���"+src.getName()+"�����ļ�"+dest.getName());
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("��ȡ�ļ����ļ�д��ʧ��");
		}*/	
		doCopyFile(new File(srcPath),new File(destPath));
	}
	public void doCopyFile(File src,File dest) throws IOException {
		if(!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�");
		}
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		byte[] bt = new byte[1024];
		try {
			while(is.read(bt)!=-1) {
				os.write(bt);
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("��ȡ�ļ����ļ�д��ʧ��");
		}
		os.flush();
		os.close();
		is.close();
		System.out.println("��ɿ����ļ���"+src.getName()+"�����ļ�"+dest.getName());
	}
	public void doCopyDir(File src,File dest) throws IOException {
		if(src.getAbsolutePath().equals(dest.getAbsoluteFile())) {
			System.out.println("�����Ը�������·��һ�����ļ�(��)");
		}
		doCopyDirDetail(src,dest);
		
	}
	
	
	public void doCopyDirDetail(File src,File dest) throws IOException {
		if(src.isFile()) {//src�������ļ����
			try {
				doCopyFile(src,dest);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out.println("�ļ���дʧ��");
			}
		}
		else if (src.isDirectory()) {  //srcҲ���ļ���
			dest.mkdirs();  //�����ļ��м�·��
			for(File temp:src.listFiles()) {
				doCopyFile(temp,new File(dest,temp.getName()));
			}
			
		}
	}
	
	
	
	
}
