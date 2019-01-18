package com.sherman.testnet.tcp.chat.demo3;

import java.io.Closeable;
import java.io.IOException;

/**
 * 统一的关闭所有IO流的方法
 * @author Auser
 *
 */
public class CloseUtil {
	public static void closeAll(Closeable... io) {
		for(Closeable temp:io) {
			if(temp != null) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
