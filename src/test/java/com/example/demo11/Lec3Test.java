package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {

	@Test // 遞迴練習 1加到~100
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		// 當拆解到最小問題時，直接傳回答案
		if (x == 1) {
			return 1;
		}
		// 每一次的答案會是原本傳進來的參數 + 以(參數-1)來呼叫此方法的結果
		// 程式碼內自己呼叫自己，就稱為遞迴
		int sum = x + this.recurrence(x - 1);
		return sum;
		// return x +this.recurrence
	}

	@Test
	public void ifTest() {
		String weather = "下雨";
		// if...
		if (weather == "下雨") { // 如符合即執行
			System.out.println("帶雨傘");
		}
		System.out.println("不用帶傘"); // 執行完if內的內容後，會接著往下執行程式碼

		// if...else...
		if (weather == "下雨") { // 如符合
			System.out.println("帶雨傘"); // 即執行
		} else { // 否則
			System.out.println("不用帶傘"); // 執行else後的內容
		}

		// if...else if...else...
		if (weather == "下雨") { // 如符合即執行
			System.out.println("帶雨傘");
		} else if (weather == "大太陽") { // 否則，如符合else if 即執行
			System.out.println("戴墨鏡");
		} else { // 否則執行
			System.out.println("不用攜帶任何東西");
		}

		int a = 15;

	}

	@Test // 票價計算
	public void iftest2() {
		double x = this.price(85); //
//		System.out.println(x);  //
		System.out.printf("票價: %d元", (int) x); // %d幫整數佔位(不能用小數點)，%s幫字串佔位
	}

	public double price(int age) { //
		double ticketprice = 100; //
		if (age <= 6 || age >= 80) {
			double price = ticketprice * 0.2;
			return price;
		} else if (age <= 12 || age >= 60) {
			double price = ticketprice * 0.5;
			return price;
		} else {
			double price = ticketprice;
			return price;
		}

		/*
		 * if (age <= 6 || age>=80 ) { double price = ticketprice*0.2; return price; }
		 * if(age>=7 && age<=12 || age>=60 && age<=79) { double price = ticketprice*0.5;
		 * return price; } if(age>=60 && age<=79) { double price = ticketprice*0.5;
		 * return price; } return price;
		 */
	}

	@Test // 1a2b遊戲
	public void iftest3() {

	}

	@Test
	public void switchtest() {

		int scores = 100;

		switch (scores / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");

		}
	}

	@Test // 猜數字
	public void guessNumberPrepare() {
		// *****螢幕輸入
		System.out.println("請輸入數字");
		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.println("您輸入的數字是:"+ i);
		String str2 = scan.nextLine();
		System.out.println("您輸入的內容是:" + str2);
		char ch = str2.charAt(2);
		System.out.println("");

	}

	@Test
	public void guessNumbertest() {

		Random ran = new Random();
		int x = ran.nextInt(2, 99);
		int a = 1;
		int b = 99;
		System.out.println("請猜數字");
		Scanner scan = new Scanner(System.in);
		for(;;) {
						
			int i = scan.nextInt();
			if(i<1 || i>99) {
				System.out.printf("請輸入1~99之間的整數\n");
			}						
			if (i < x && i>=1) {
//			if (0 < i < x ) {	
				System.out.printf("請在%d~%d範圍內猜個數字\n", i , b);
				a = i;
			}
			if (i > x && i<=99) {
				System.out.printf("請在%d~%d範圍內猜個數字\n", a , i);
				b = i;
			}
			if (i == x) {
				System.out.println("恭喜答對");
				break;
			}
		}
		

	}
}
