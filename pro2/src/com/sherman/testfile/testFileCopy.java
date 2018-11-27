package com.sherman.testfile;

import java.io.File;
import java.io.IOException;

/**
 * ≤‚ ‘À˘–¥µƒcopyfile¿‡
 * @author Auser
 *
 */
public class testFileCopy {
	public static void main(String[] args) throws IOException {
		copyFile cf = new copyFile();
		cf.doCopyFile("E:\\testfile\\excel1.xlsx", "E:\\testfile\\excel2.xlsx");
		File src  = new File("E:\\testfile\\excel22.xlsx");
		File dest = new File("E:\\testfile\\excel23.xlsx");
		copyFile cf2 = new copyFile();
		cf2.doCopyFile(src, dest);
	}
}
