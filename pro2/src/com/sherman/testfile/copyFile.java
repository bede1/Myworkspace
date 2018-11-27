package com.sherman.testfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 建立拷贝文件的方法
 * 具体步骤：
 *  1、建立联系   File对象   源头 目的地
2、选择流     
	 文件输入流  InputStream FileInputStream
	  文件输出流  OutputStream FileOutputStream
3、操作  :  拷贝
	 byte[] flush =new byte[1024]; 
	 int len =0;
	  while(-1!=(len=输入流.read(flush))){  
		 输出流.write(flush,0,len)
	  }
             输出流.flush
4、释放资源 :关闭 两个流
 * @author Auser
 *
 */
public class copyFile {

	public copyFile() {
		
	}
	//只是拷贝文件（按照路径拷贝）
	public void doCopyFile(String srcPath,String destPath) throws IOException {
		//合并相同的代码
		/*File src = new File(srcPath);
		File dest = new File(destPath);
		//1、建立联系源（存在且为文件）+目的地（文件可以不存在）
		if(!src.isFile()) {  //文件不存在或者不是文件
			System.out.println("只能拷贝文件");
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
			System.out.println("完成拷贝文件："+src.getName()+"至新文件"+dest.getName());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("读取文件或文件写入失败");
		}*/	
		doCopyFile(new File(srcPath),new File(destPath));
	}
	public void doCopyFile(File src,File dest) throws IOException {
		if(!src.isFile()) {
			System.out.println("只能拷贝文件");
		}
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		byte[] bt = new byte[1024];
		try {
			while(is.read(bt)!=-1) {
				os.write(bt);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("读取文件或文件写入失败");
		}
		os.flush();
		os.close();
		is.close();
		System.out.println("完成拷贝文件："+src.getName()+"至新文件"+dest.getName());
	}
	public void doCopyDir(File src,File dest) throws IOException {
		if(src.getAbsolutePath().equals(dest.getAbsoluteFile())) {
			System.out.println("不可以复制两个路径一样的文件(夹)");
		}
		doCopyDirDetail(src,dest);
		
	}
	
	
	public void doCopyDirDetail(File src,File dest) throws IOException {
		if(src.isFile()) {//src正好是文件情况
			try {
				doCopyFile(src,dest);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				System.out.println("文件读写失败");
			}
		}
		else if (src.isDirectory()) {  //src也是文件夹
			dest.mkdirs();  //创建文件夹及路径
			for(File temp:src.listFiles()) {
				doCopyFile(temp,new File(dest,temp.getName()));
			}
			
		}
	}
	
	
	
	
}
