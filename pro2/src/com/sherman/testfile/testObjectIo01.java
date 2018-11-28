package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * �������еČ��󶼿������л�  java.io.NotSerializableException
 * �������еČ��Զ���Ҫ���л�  transient
 * @author Auser
 *
 */
public class testObjectIo01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	write("E:\\testfile\\testobjectio\\obj1.txt");
	read("E:\\testfile\\testobjectio\\obj1.txt");
	}
	
	public static void read(String destPath) throws IOException, IOException, ClassNotFoundException {
		//����Դ
		File src = new File(destPath);
		//ѡ����
		ObjectInputStream dis = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(src)));
		//����   ��ȡ��˳����д����˳�����һ��
		Object obj = dis.readObject();
		if(obj instanceof Employee) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		obj = dis.readObject();
		int[] arr=(int[])obj;
		System.out.println(Arrays.toString(arr));
		dis.close();
		}
	
	
	//�������л�
	public static void write(String destPath) throws IOException, IOException {
		Employee emp = new Employee("sherman",10000);
		int[] arr = {1,2,3,4,5,6};
		//����Դ
		File dest = new File(destPath);
		//������
		ObjectOutputStream dos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest)));
		//���� д����˳��Ϊ��ȡ��׼��
		dos.writeObject(emp);
		dos.writeObject(arr);
		//�ͷ���Դ
		dos.close();
	}

}