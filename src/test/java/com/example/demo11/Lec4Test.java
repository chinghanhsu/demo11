package com.example.demo11;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec4Test {

	@Test
	public void listTest() {
		// 宣告
		List<String> list1 = Arrays.asList("1", "2"); // 無法增刪長度
		List<Integer> list2 = List.of(99, 100); // 無法修改
		List<Character> list3 = new ArrayList<>(); // 可以任意修改，常用
		List<String> list7 = new ArrayList<String>(); // 後面的角括號依樣可以填入資料型態，但因為很麻煩，通常不會寫
		List<String> list8 = new ArrayList<>(list1); // 宣告同時給值
//		System.out.println(list8.get(0));

		// 使用 ArrayList 才能夠修改 List 的內容
		list8.add("3");
		System.out.println(list8.get(0));
		list8.remove("1");
		System.out.println(list8.get(0));

		// Q 為什麼是 new ArrayList ?
//		List<Character> list5= new List<>();
		// A 因為 list 是 interface 的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創建
		// 如果試圖 new List 會導致錯誤
//		list3 = new LinkedList<Character>();
		// Q 為什麼不使用 ArrayList 來裝 new ArrayList 的結果?
//		ArrayList<Character> list4= new ArrayList<>();
//		list4 = new LinkedList<Character>();
		// A (1) 因為ArrayList 是實作 List 裡面定義好的方法，故ArrayList 可以被視為是 List 的一種
		// 故 List 不會對 ArrayList 有排斥反應，可以裝進 ArrayList
		// ==> 只要是實作 interface 的類別(class)，都可以用 interface 作為其容器(變數)的資料型態
		// (2) 因為 interface 可以被多個類別實作，對於 interface 來說，不同實作都是他的一種
		// 因對不同實作(class)來說，彼此互不相通，故沒有辦法裝進彼此裡面
		// 因此採用 interface 作為容器的資料型態，可以承裝各式各樣的實作類別(class)

//		System.out.println(list1.get(1));
		// Arrays.asList 和 List.of 的昂度無法變更，若對其使用 add(新增) 或 remove(刪除)，就會報錯
//		list1.add("3");
	}

	/*
	 * public double avgWeatherByList(List<Double> weatherList) { double sum = 0;
	 * for(int i = 0; i < weatherList.size(); i++) { sum += weatherList.get(i); }
	 * return sum / weatherList }
	 */

	@Test
	public void arrayTest() {

		// 宣告陣列
		int[] arr1 = new int[7]; // 單純宣告
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // 單純宣告
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 }; // 宣告同時給值

		// 剛宣告的陣列內容值都會是null或預設值(如宣告時沒有賦值)
		System.out.println(arr1[0]); // 如果使用基本資料型態宣告，會自動幫你裝進預設值
		System.out.println(arr1Class[0]); // 如果使用類別型態宣告，不會有預設值，會是空的
		System.out.println(arr2[7]); // 因為索引值是從 0 開始，故長度為 7 時，索引值會在 0~6，程式找不到索引值為 7 的格子，就會報錯

		// 放值
		arr1[0] = 99;
		System.out.println(arr1[0]);

		// practice
		double weatherW1 = 30.0;
		double weatherW2 = 26.5;
		double weatherW3 = 27.5;
		double weatherW4 = 23.3;
		double weatherW5 = 21.8;
		double weatherW6 = 28.5;
		double weatherW7 = 35.9;
		double[] weather = { 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 };

		System.out.println(this.avgWeather(weather));
	}

	public double avgWeather(double[] weatherData) {

		System.out.println(weatherData.toString()); // 只要不是基本資料型態變數裡面就會是記憶體位置，故直接把變數名稱轉換成字串，會印出
		System.out.println(Arrays.toString(weatherData)); // 需要使用 Arrays 提供的方法才能正確印出內容值

		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) { // 陣列的索引值最大 < 長度，因為索引值永遠都會是長度-1
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	@Test // 分數練習
	public void arrayTest1() {
		double[] score = { 80, 85, 70, 83, 90 };
		Arrays.sort(score); //
		System.out.println(this.avgScore(score));
	}

	public double avgScore(double[] scoreData) {

		System.out.println(Arrays.toString(scoreData));

		double sum = 0;
		for (int i = 1; i < scoreData.length - 1; i++) {
			sum += scoreData[i];
			System.out.println(scoreData[i]);
		}
		double avg = sum / (scoreData.length - 2);
		return avg;
	}

	@Test // 分數練習(助教)
	public void practiceTest() {
		int[] score = { 60, 61, 62, 59, 58 };
		this.avgScore(score);

	}

	public double avgScore(int[] score) {
		System.out.println("您輸入的陣列為:" + Arrays.toString(score));
		int sum = 0;
		int max = score[0];
		int min = score[0];
		for (int i = 0; i < score.lenght; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
			sum += score[i];
		}
		System.out.printf();
		return (sum - max - min) / (score.length - 2);
	}

	@Test // 0開頭四位隨機數生成
	public void listpractice() {
		List<Integer> list= new ArrayList<>();
		int num = 0;
		for(;;) {
			num = (int)(Math.random()*10);
			if(!list.contains(num)) {
				list.add(num);
			}
			if(list.size()==4) {
				break;
			}
			
		}
		 // 遍歷
		for(int num2 : list) {
			System.out.print(num2);
		}

	}
}
