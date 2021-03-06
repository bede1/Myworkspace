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
 * 不是所有的對象都可以序列化  java.io.NotSerializableException
 * 不是所有的屬性都需要序列化  transient
 * @author Auser
 *
 */
public class testObjectIo01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	write("E:\\testfile\\testobjectio\\obj1.txt");
	read("E:\\testfile\\testobjectio\\obj1.txt");
	}
	
	public static void read(String destPath) throws IOException, IOException, ClassNotFoundException {
		//创建源
		File src = new File(destPath);
		//选择流
		ObjectInputStream dis = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(src)));
		//操作   读取的顺序与写出的顺序必须一致
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
	
	
	//进行序列化
	public static void write(String destPath) throws IOException, IOException {
		Employee emp = new Employee("sherman",10000);
		int[] arr = {1,2,3,4,5,6};
		//创建源
		File dest = new File(destPath);
		//创建流
		ObjectOutputStream dos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest)));
		//操作 写出的顺序为读取做准备
		dos.writeObject(emp);
		dos.writeObject(arr);
		//释放资源
		dos.close();
	}

}
