package com.sherman.testfile;

import java.io.IOException;

/**
 * ������д��filecopy��
 * @author Auser
 *
 */
public class testFilecoy2 {
	public static void main (String[] args) throws IOException {
		fileCopy fc = new fileCopy();
		fc.setInputPath("E:\\testfile\\filecopy\\filecopy.txt");
		fc.setOutputPath("E:\\testfile\\filecopy\\filecopy2.txt");
		fc.dofileCopy(fc.inputPath, fc.outputPath);
		fileCopy fc2 = new fileCopy();
		fc2.setInputPath("E:\\\\testfile\\\\filecopy\\\\filecopy3.jpg");
		fc2.setOutputPath("E:\\\\testfile\\\\filecopy\\\\filecopy4.jpg");
		fc2.dofileCopy(fc2.inputPath, fc2.outputPath);
	}
}
