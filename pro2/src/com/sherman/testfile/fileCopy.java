package com.sherman.testfile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 通过字节数组流实现文件的输入输出
 * @author Auser
 *
 */
public class fileCopy {
	String inputPath;
	
	//File inputfile = new File(inputPath);
	String outputPath;
	//File outputfile = new File(outputPath);
	public void dofileCopy(String inputPath, String outputPath) throws IOException {
		if(!(new File(inputPath)).isFile()) {
			System.out.println("文件不存在");
		}
	byte[] ori = new byte[512];
	InputStream is = new BufferedInputStream(new FileInputStream(new File(inputPath)));
	OutputStream os = new BufferedOutputStream(new FileOutputStream(new File(outputPath)));
	int len = 0;
	while (-1!=(len=is.read(ori))) {
		os.write(ori, 0, len);
	}
	os.flush();
	os.close();
	is.close();
	}
	
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	public String getOutputPath() {
		return outputPath;
	}
	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}
	
}
