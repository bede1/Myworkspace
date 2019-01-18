package com.sherman.testnet.tcp.chat.demo3;

import java.io.Closeable;
import java.io.IOException;

/**
 * ͳһ�Ĺر�����IO���ķ���
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
