package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5Test2 {
	@Test
	public void mathTest() {
		int a = Math.max(99, 2);
		System.out.println(a);
		int b = Math.min(99, 2);
		System.out.println(b);
		int c = Math.max(1, Math.max(2, 99)); // 要比較三個值以上的話，一樣得兩個比，再拿贏家去比較下一輪 (呼叫多次 max/min 的方法)
		System.out.println(c);

		int d = Math.abs(-1);
		System.out.println(d);
		int e1 = (int) Math.round(3.4);
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		int f1 = (int) Math.rint(2.5); // 2 (0.5) 2.5 (1.5) 4
		int f2 = (int) Math.rint(3.5); // 2 (1.5) 3.5 (0.5) 4
		System.out.println(f1);
		System.out.println(f2);
		int g1 = (int) Math.ceil(2.5);
		int g2 = (int) Math.floor(2.5);
		System.out.println(g1);
		System.out.println(g2);

		int h1 = (int) Math.sqrt(4);
		int h2 = (int) Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);

		int i = (int) Math.pow(10, 2); // 10^2
		System.out.println(i);
	}

	@Test
	public void stringTest() {
		// 長度
		String str1 = "123456";
		int a = str1.length();
//		System.out.println(a);

		// 判斷內容有無意義
		String str5 = new String(); // 預設空字串
		String str4 = null; //
		String str2 = ""; // 空字串 (empty string)
		String str3 = " "; // 空白字串
//		System.out.println(str5);
//		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		if (str4 != null) {
			boolean b21 = str4.isEmpty();
		}
//		System.out.printf("字串長度為：%d, isEmpty的結果為：%b\n", str2.length(), b1);
//		System.out.printf("字串長度為：%d, isEmpty的結果為：%b\n", str3.length(), b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
//		System.out.printf("字串長度為：%d, isBlank的結果為：%b\n", str2.length(), b3);
//		System.out.printf("字串長度為：%d, isBlank的結果為：%b\n", str3.length(), b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
//		System.out.printf("字串長度為：%d, hasLength的結果為：%b\n", str2.length(), b5);
//		System.out.printf("字串長度為：%d, hasLength的結果為：%b\n", str3.length(), b6);
//		System.out.printf("字串長度為：%d, hasLength的結果為：%b\n", 0, b7);
		boolean b8 = StringUtils.hasText(str2);
		boolean b9 = StringUtils.hasText(str3);
		boolean b10 = StringUtils.hasText(str4);
//		System.out.printf("字串長度為：%d, hasText的結果為：%b\n", str2.length(), b8);
//		System.out.printf("字串長度為：%d, hasText的結果為：%b\n", str3.length(), b9);
//		System.out.printf("字串長度為：%d, hasText的結果為：%b\n", 0, b10);

		// 搜尋
		String s1 = "小龍女與楊過與楊與楊";
		String s2 = "過";
//		System.out.println(s1.contains("不"));
//		System.out.println(s1.charAt(4));
//		System.out.println(s1.indexOf("楊"));
//		System.out.println(s1.indexOf("不"));  // 如果搜尋不到結果，會回傳 -1 
//		System.out.println(s1.lastIndexOf("楊"));
//		System.out.println(s1.indexOf("楊", 4));
//		System.out.println(s1.indexOf("楊", 5));
//		System.out.println(s1.lastIndexOf("楊", 9));		
//		System.out.println(s1.lastIndexOf("楊", 8));		
//		indexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
//		lastIndexOf("搜尋內容", 起始位置)：從起始位置開始搜尋

		// 裁剪
//		s1 = s1.substring(7);  // 在使用 String 的裁剪方法時，大部分都是將結果回傳 (不會直接改變記憶體內的值)，故要用變數裝起來，才能取得改變的內容值
//		System.out.println(s1);
//		System.out.println(s1.substring(7));
//		System.out.println(s1.substring(7, 9));   // index >= 7  AND index < 9
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		System.out.println(s1.replace("與", ""));  // 當以空字串取代某個文字時，即可批量刪除某個文字
//		System.out.println(s1.replace(" ", ""));  // 當以空字串取代空白時，即可把字串中的所有空白格刪除
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.replaceAll("與", ""));

		// 轉換資料型態
		String[] ar1 = s1.split("與");
		String[] ar2 = s1.split("");
//		System.out.println(Arrays.toString(ar1));
//		System.out.println(String.join("+", ar1));
//		System.out.println(s1.toCharArray());   // char array 是陣列中的特例，不會印出記憶體位置，而可以直接列出內容值，但印出的結果不會用 , 分隔
//		System.out.println(Arrays.toString(s1.toCharArray()));
		char[] ch = new char[2];
//		System.out.println(ch);
//		s1.getChars(7, 9, ch, 0);
//		System.out.println(ch);
		String q1 = String.valueOf(1);
		String q2 = String.valueOf(true);
		String q3 = String.valueOf(0.0);
		q1 = 1 + "";
		Integer z1 = Integer.valueOf("1");
		int z2 = Integer.parseInt("1");

		// 比較內容值
		String st1 = "a";
		String st2 = "a";
		String st3 = new String("a");
		String st4 = new String("A");
//		System.out.println(st1==st2);
//		System.out.println(st1==st3);
//		System.out.println(st1.equals(st2));
//		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(str4));
		System.out.println(st1.equalsIgnoreCase(st4));

	}

	// ****** 練習 *******
	@Test
	public void practice() {
		String q = "AAB";
		this.m1(q);
	}

	// 偷懶寫法：把字串掃一遍，掃的同時確認是哪一個字母
	public void m1(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
//		String[] a1 = str.split("");
//		for(int i = 0; i < a1.length; i++) {
//			switch(a1[i]) {
//			case "A":
//				a++;
//				break;
//			case "B":
//				b++;
//				break;
//			case "C":
//				c++;
//				break;
//			case "D":
//				d++;
//			}
//		}

//		char[] a2 = str.toCharArray();
//		for (int i = 0; i < a2.length; i++) {
//			switch (a2[i]) {
//			case 'A':
//				a++;
//				break;
//			case 'B':
//				b++;
//				break;
//			case 'C':
//				c++;
//				break;
//			case 'D':
//				d++;
//			}
//		}
		
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
				a++;
				break;
			case 'B':
				b++;
				break;
			case 'C':
				c++;
				break;
			case 'D':
				d++;
			}
		}		
		System.out.printf("%d個A  %d個B  %d個C  %d個D", a, b, c, d);

	}

	// indexOf 寫法：一次只計算某個字母
	public void m2(String str) {
		int a = this.m2Branch(str, "A");
		int b = this.m2Branch(str, "B");
		int c = this.m2Branch(str, "C");
		int d = this.m2Branch(str, "D");
	}
	
	public int m2Branch(String str, String target) {
		int count = 0;
		int i = 0;
		while(str.indexOf("A", i) != -1) {
			count++;
			i = str.indexOf("A", i) + 1;
		}
		return count;
	}
	
	// replace：藉由原本的長度和剩下的長度，推算少了幾個值
	public void m3(String str) {
		String[] targetArr = {"A", "B", "C", "D"};
		int[] countArr = new int[4];   // 0:A的數目，1：B的數目，2：C的數目，3：D的數目
		for(int i = 0; i < targetArr.length; i++) {
			if(str.length()==0) {
				break;
			}
			int old = str.length();
			str = str.replace(targetArr[i], "");
			int newest = str.length();
			countArr[i] = old - newest;			
		}
	}

}
