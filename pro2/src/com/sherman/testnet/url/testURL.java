package com.sherman.testnet.url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 测试从网上爬取数据，并存取到文件中()
 * @author Auser
 *
 */
public class testURL {
	public static void main(String[] args) throws IOException {
		URL url  = new URL("http://www.163.com");
		File file = new File("E:\\testfile\\url","url.doc");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"gbk"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String msg = null;
		while((msg=br.readLine())!=null) {
			bw.append(msg);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
