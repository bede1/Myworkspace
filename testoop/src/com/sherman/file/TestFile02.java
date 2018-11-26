package com.sherman.file;

import java.io.File;

public class TestFile02 {
	public static void main(String[] args) {
		test1();
		test2();
	}
	public static void test1() {
		File src = new File("E:/XP/D/2.jpg");
		System.out.println(src.getName());
	}
	public static void test2() {
		File src = new File("E:/XP/D/2.jpg");
		System.out.println(src.exists());
		System.out.println(src.canRead());
	}
}
