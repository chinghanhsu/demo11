package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	void contextLoad() {
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(30);
		// class ���O
		
	}
	@Test
	public void stringTest() {
		String str = "abc";
		str = str +"ABC"; // str = "abcABC"
		System.out.println(str);
	}
	
	@Test
	public void stringTest2() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		System.out.println(str.equals(str2));
		
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC");
		strBuf.append("DEF").append("GHI");
		System.out.println(strBuf.toString());
		System.out.println(strBuf.delete(0, 0));
			
	}
	
	@Test
	public void stringReverseTest() {
		String str = "abcde"; //����5
		String[] strArray = str.split("");  // [a, b, c, d, e]
		                              // index: 0  1  2  3  4
		String newStr = "";
		for(int i = strArray.length; i >= 0; i--) {  // i-- : ���槹�j�A����~��
			String item = strArray[i];
			newStr = newStr + item;  // 
			// �Ĥ@��: i = 4; item = "e"; newStr �q "" --> ""+"e" = "e"
			// �ĤG��: i = 3; item = "d"; newStr �q "e" --> "e"+"d" = "ed"
			// �ĤT��: i = 2; item = "c";
			// �ĥ|��: i = 1; item = "b";
			// �Ĥ���: i = 0; item = "a";
		}
		//============================================
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();		
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a >= 18) {
			System.out.println("�~��: " + a);
			System.out.println("�w���~");			
		}
		
	}

}
