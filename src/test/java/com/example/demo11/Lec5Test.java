package com.example.demo11;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5Test {
	
	@Test
	public void mathTest() {
		int a = Math.max(99,2);
		System.out.println(a);
		int b = Math.min(99,2);
		System.out.println(b);
		// 1, 2, 99
		int c = Math.max(1, Math.max(2, 99));  // 要比較三個值以上的話，需先比較兩個值，得結論再進行下一輪(呼叫多次 max/min 的方法)
		System.out.println(c);
		
		int d = Math.abs(-1); // 取絕對值
		System.out.println(d);
		int e1 = (int) Math.round(3.4);		// 四捨五入
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		int f1 = (int) Math.rint(2.5);  // 2 (0.5) 2.5 (1.5) 4
		int f2 = (int) Math.rint(3.5);  // 2 (1.5) 3.5 (0.5) 4
		System.out.println(f1);
		System.out.println(f2);
		int g1 = (int) Math.ceil(2.5);  
		int g2 = (int) Math.floor(3.5);
		System.out.println(g1);
		System.out.println(g2);
		
		int h1 = (int) Math.sqrt(4);  
		int h2 = (int) Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);
		
		int i = (int) Math.pow(10, 2);  // 10^2
		System.out.println(i);
	}
	
	@Test
	public void stringTest() {
/*		// 長度
		String str1 = "123456";
		int a = str1.length();
		System.out.println(a);
		
		// 判斷內容有無意義
		String str5 = new String();  // 預設空字串
		String str4 = null;  // 		
		String str2 = "";  // 空字串
		String str3 = " ";  // 空白字串
		System.out.println(str5);
		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		if(str4 != null) {
			boolean b21 = str4.isEmpty();
		}				
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str2.length(), b1);
		System.out.printf("字串長度為:%d, isEmpty的結果為:%b\n", str3.length(), b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
		System.out.printf("字串長度為:%d, isBlank的結果為:%b\n", str2.length(), b3);
		System.out.printf("字串長度為:%d, isBlank的結果為:%b\n", str3.length(), b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
		System.out.printf("字串長度為:%d, hasLength的結果為:%b\n", str2.length(), b5);
		System.out.printf("字串長度為:%d, hasLength的結果為:%b\n", str3.length(), b6);
		System.out.printf("字串長度為:%d, hasLength的結果為:%b\n", 0, b7);
		boolean b8 = StringUtils.hasText(str2);
		boolean b9 = StringUtils.hasText(str3);
		boolean b10 = StringUtils.hasText(str4);
		System.out.printf("字串長度為:%d, hasText的結果為:%b\n", str2.length(), b8);
		System.out.printf("字串長度為:%d, hasText的結果為:%b\n", str3.length(), b9);
		System.out.printf("字串長度為:%d, hasText的結果為:%b\n", 0, b10);
*/		
//		StringUtils.hasLength(變數名稱) : 判斷 null + isEmpty，除了判斷長度，還會自行篩選null
//		StringUtils.hasText(變數名稱) : 判斷 null + isBlank，通常都主要用這個
		
		// 搜尋		
 		String s1 = "小龍女與楊過與楊與楊";
/*		System.out.println(s1.contains("不"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("楊")); // 由左邊開始找
		System.out.println(s1.indexOf("不")); // 若搜尋不到結果會回傳-1
		System.out.println(s1.lastIndexOf("楊")); // 由右邊開始找
		System.out.println(s1.indexOf("楊", 5)); // 由左邊開始找
		System.out.println(s1.indexOf("楊", 4)); // 由左邊開始找
		System.out.println(s1.lastIndexOf("楊", 8)); // 由右邊開始找
 */
 		
 		// 轉換資料型態
 		String[] ar1 = s1.split("與");
 		String[] ar2 = s1.split("");
 		System.out.println(Arrays.toString(ar1));
 		System.out.println(String.join("+", ar1));
 		System.out.println(s1.toCharArray());  // char array是陣列中的特例，不會印出記憶體位置，而可以直接列出內容值，但印出結果不會
 		System.out.println(Arrays.toString(s1.toCharArray()));
	
		
	}
	
	@Test  // ABCD字串計算
	public void stringTest2() {
		String str1 = "AABCBDCDACBDA";
		System.out.printf("字串的ABCD字母個數為:%d", str1.length());
		System.out.println();
		int a = (str1.indexOf("A",0)); // 索引值由0開始找
		
		System.out.println(a);
	}
	
//	@Test
	public void m1() {
		
		
	}
	
}
