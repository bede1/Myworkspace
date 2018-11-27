package com.sherman.testfile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 5������Ŀ¼
mkdir() ����Ŀ¼������ȷ�� ��Ŀ¼���ڣ���������ڣ�����ʧ��
mkdirs() ����Ŀ¼�������Ŀ¼��������һͬ����
list() �ļ�|Ŀ¼ ���ַ�����ʽ
listFiles()
static listRoots() ��·��
 * @author Auser
 *
 */
public class testFile04 {
	public static void main(String[] args) {
		String path = "E:/testfile/test";
		File src = new File(path);
		if(src.isDirectory()) {
			System.out.println("�¼�Ŀ¼������Ŀ¼");
			String[] subNames = src.list();
			if(subNames.length==0) {
				System.out.println("��Ŀ¼�����ļ�");
			}
			//System.out.println(subNames[0]);  //����ʹ��
		for(String temp:subNames) {
			System.out.println(temp);
		}
		File[] subFiles = src.listFiles();
		if(subFiles.length==0) {
			System.out.println("���ļ����޷����·��");
		}
		for(File temp:subFiles) {
			System.out.println(temp.getAbsolutePath());
		}
		System.out.println("------���ļ�.java����------");
		//�������ģʽ
		subFiles = src.listFiles(new FilenameFilter(){

			@Override
			public boolean accept(File arg0, String arg1) {
				// TODO �Զ����ɵķ������
				return new File(arg0,arg1).isFile()&&arg1.endsWith(".java");
			}
			
		});
		for (File temp:subFiles) {
			System.out.println(temp.getAbsolutePath());
		}
		
		}
		
		
	}

}
