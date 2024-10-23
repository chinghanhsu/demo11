package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void test0() {
		// \ 在 java 中表示跳脫符號，用來跳脫有特殊意義的符號 --> 讓有特殊意義的符號變成單純的字串
		// \ 跳脫符號無法單獨存在
		// \\ --> 第一個跳脫符號是讓第二個跳脫符號從有特殊意義變成單純的字串
		String pattern = "\\";
		System.out.println(pattern);
	}

	@Test
	public void test() {
		// 比對手機號碼格式: 數字4碼-數字3碼-數字3碼
		// \d 表示數字 0~9 的任意其中一個
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String input = scan.next();
		boolean check = input.matches(pattern); //
		if (check) { // 等同於 check == true
			System.out.println(input + "符合手機號碼格式!!");
		} else {
			System.out.println(input + "不符合手機號碼格式!!");
		}
		// =======================================================
		// 上面的 input.matches(patten) 的結果用變數 check 接回來
		// 但在後續的程式碼中，變數check 指使用了一次
		// 所以可以使用匿名(不需要用變數名稱來接計算的結果)的方式來改寫

		if (input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input + "符合手機號碼格式!!");
		} else {
			System.out.println(input + "不符合手機號碼格式!!");
		}
	}

	@Test
	public void test1() {
		// 比對手機號碼格式: 數字4碼-數字3碼-數字3碼
		// \d 表示數字 0~9 的任意其中一個
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// 使用大括號 {} 處理 pattern 中重複出現的字串
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// 上一行 -\\d{3} 重複出現了2次， -\\d{3} 是包含了 -, \\d, {3} 這三個字串
		// 所以需要用小括號將這3個字串框成同一組 (-\\d{3})，再用大括號處理重複的部分
		String pattern = "\\d{4}(-\\d{3}){2}";

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String input = scan.next();

		if (input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input + "符合手機號碼格式!!");
		} else {
			System.out.println(input + "不符合手機號碼格式!!");
		}
	}

	@Test
	public void test2() {
		// 市話格式1: 數字2碼-數字7碼
		String pattern1 = "\\d{2}-\\d{7}";
		// 市話格式2: (數字2碼)-數字7碼
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格式為 數字2碼-數字7碼 或是 (數字2碼)-數字7碼");
		String input = scan.next();
		if (input.matches(pattern1) || input.matches(pattern2)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
		// ================================================
		// 合併 pattern1 和 pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}"; // 法1
		// 正規表達式的pattern裡面不能隨便留空白，會算在裡面
		if (input.matches(pattern3)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}"; // 法2
		if (input.matches(pattern4)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
	}

	@Test
	public void test3() {
		// 市話格式: 數字2碼-數字7碼或8碼
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8} : 表示 \\d 至少出現7次，至多出現8次
		String pattern1 = "\\d{2}-\\d{7,8}";
	}

	@Test
	public void homework() {
		// 市話格式: 區碼2碼用 (xx) 或 xx-，電話7~8碼
		String pattern = "(\\d{2}-|\\(\\d{2}\\))\\d{7,8}";

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格式為 數字2碼-數字7~8碼 或是 (數字2碼)數字7~8碼");
		String input = scan.next();

		if (input.matches(pattern)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
	}

	@Test
	public void homework2() {
		// 市話格式: 區碼2~4碼(0開頭)-電話7~8碼
		String pattern = "0\\d{1,3}-\\d{7,8}";

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格式為 0開頭 數字2~4碼-數字7~8碼");
		String input = scan.next();

		if (input.matches(pattern)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
			System.out.println(input + "不符合市話號碼格式!!");
		}
	}

	@Test
	public void test4() {
		String pattern = "[A-CSW-Z]"; // 符合的字母有: A、B、C、S、W、X、Y、Z
		String str = "_";
		System.out.println(str.matches(pattern));
		String str1 = "\n";
		System.out.println("======================");
		System.out.println(str1);

	}

	@Test
	public void test5() {
		// 格式為數字2~4碼(0開頭後3碼不為0)-數字7~8碼
		String pattern = "0[1-9]{1,3}-\\d{7,8}"; // [1-9]{1,3} [數字範圍]{次數範圍}

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入號市話碼:格式為數字2~4碼(0開頭後3碼不為0)-數字7~8碼");
		String input = scan.next();

		if (input.matches(pattern)) {
			System.out.println(input + "符合市話號碼格式!!");
		} else {
		}
		System.out.println(input + "不符合市話號碼格式!!");

	}

	@Test
	public void test6() {
//		String pattern = "[A-Z|a-z][1|2][0-9]{8}"; // 版本1
		String pattern = "[A-Z|a-z&&[^ABDEFHabdefh]][1|2][0-9]{8}"; //版本2

		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入身分證字號:格式為英文大小寫開頭，後接1或2開頭之數字9碼，總共10碼"); // 版本1
		System.out.println("請輸入身分證字號:英文大小寫開頭排除ABDEFHabdefh，後接1或2開頭之數字9碼，總共10碼"); // 版本2
		String input = scan.next();
		
		if (input.matches(pattern)) {
			System.out.println(input + "符合格式!!");
		} else {
			System.out.println(input + "不符合格式!!");
		}

	}

}
