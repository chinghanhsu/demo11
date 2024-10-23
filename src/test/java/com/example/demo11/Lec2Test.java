package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	@Test
	public void reviewLec1() {
		int a;
		String b = "1111";
	}
	public void commentest() {
		// 單行註解
		
		/*
		 * 多行註解
		 * 這個註解處理方式可以撰寫比較多行的筆記
		 */
		this.fileCommentTest(0);
	}
	
	/**
	 * 
	 * @param test 書本的ISBN編號
	 * @return 書本名稱
	 */
	public String fileCommentTest(int test) {
		return null;
	}
	
	@Test
	public void computeTest() {
		int a = 10;
		System.out.println(a);
		System.out.println(a++ *10); // a*10; a=a+1;
		System.out.println(a);
		
		System.out.println("**********");
		
		a = 10;
		System.out.println(a);
		System.out.println(++a *10); // a=a+1; a*10;
		System.out.println(a);
		
	}
	
	@Test
	public void computeTest2() {
		int a = 3;
		int b = 33;
		System.out.println(a+=9);
		System.out.println(--a); 
		System.out.println(a*=5);
		System.out.println(a=b/5);
		System.out.println(a%=b); 
		System.out.println(a=b%a);
	}
	
	@Test
	public void computeTest3 () {
		boolean res1 = (1!=1);
		boolean res2 = (1==1);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res1 && res2);
		System.out.println(res1 || res2);
		
	}
	
	@Test
	public void computeTest4() {
		int a = this.sum(1, 100);
		System.out.println(a);
	}
	/**
	 * test 等差數列和
	 * @param start 數列起始值
	 * @param end 數列終始值
	 * @return
	 */
	public int sum(int start,int end) {
		int sum = ((start + end)*(end-start+1))/2;
		return sum;
	}
	
	@Test
	public void computeTest5() {
		int f = this.sum1(25);
		System.out.println(f);
				
	}
	/**
	 * 求華氏溫度(用攝氏求)
	 * @param x=celsius攝氏
	 * @return
	 */
	public int sum1(int x) {
		int sum1 =((x*9/5)+32);
		return sum1;
		
	}
	@Test
	public void computeTest6() {
		double c = this.sum2(100);
		System.out.println(c);
				
	}
	/**
	 * 求攝氏溫度(用華氏求),不用int用double(有小數點)
	 * @param y=fahrenheit華氏
	 * @return
	 */
	public double sum2(double y) {
		double  sum2=(y-32)*5/9;
		return sum2;
	}
	
	@Test
	public void forloopTest() {
		System.out.println("HI");
		this.forLoop();
	}
	
	public void forLoop() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void forloopTest2() {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	@Test // while迴圈 等差數列
	public void whileLoopTest() {
		int sum = 0;
		int i = 1;
		while(i <= 100) { // 此為判斷條件
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	@Test
	public void forloopTest3() {
		int a = this.sum2(1, 111); // int a可與下方a重複是因為下方的a是區域變數，跳脫{}後就讀不到了
		System.out.println(a);
	}
	
	public int sum2(int a,int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("*****");
		return sum;
		
		}
	@Test //九九乘法	
	public void forLoop1() { //
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%2d ", i, j, i*j); // %d=佔位符號，%2d=占兩位符號
			}
			System.out.println(); // 每當一輪j結束後換行
			System.out.printf("\n"); // "\n"=跳脫字元，會空一行
		}
	}
	
	@Test //九九乘法(while)
	public void whileLoopTest1() {
		int i = 1;
		while( i < 10) { 
			int j = 1; //類似for迴圈判斷式前項
			while(j<10) { //類似for迴圈判斷式中項
				System.out.printf("%d*%d=%2d ", i, j, i*j);
				j++; //類似for迴圈判斷式後項

			}
			System.out.println();
			i++;
		}
	}
	
	@Test //
	public void whileLoop() {
		boolean i = true;
		while(!i) {
			System.out.println("I am in~");
			
		}
	}
	
	@Test //
	public void dowhileLoop() {
		boolean i = true;
		do{
			System.out.println("I am in~");			
		} while(!i);
	}
	
	@Test //等差數列用do while
	public void dowhileLoop2() {
		int i = 0;
		int sum = 0;
		do {
			i++;
			sum += i;
		} while(i<100);
		System.out.println(sum);
	}
	@Test
	public void infiniteForLoop() {
//		while(true) {
//			System.out.println("Hi");
//		}
		int i = -1;
		for(;;) {
			i++;
			if(i == 1) {
				continue;
			}
			if(i == 5) {
				break;
		}
	    System.out.println(i);
	}
		System.out.println("I still here");
	}
	@Test // Hw 雞兔同籠 課本p6-18
	public void whileLoop2() {
		int x = 0; // 雞
		int y = 0; // 兔
		for(;;) {
			x++;
			y++;
			if(2x+4y=100) {
				continue;
			}
			if(x+y=35) {
				break;
			}
			
		}
		System.out.println("雞有= %d 隻, 兔有= %d 隻%n", x, y);
	}
	
	@Test
	public void ChickenrabbitLoop() { // 可用傳入參數的解法(方法this...)
		int head = 35;
		int foot = 130;
		
		if(foot%2 == 1) {
			System.out.println("此題無解");
			return;
		}
		int rabbit = 0; // 兔子數目
		
		while(true) {
			
			int chicken = head - rabbit; // 以兔子數反推雞的數量
			
			if(rabbit*4 + chicken*2 == foot) {
				System.out.printf("雞 : 兔\n%d : %d\n", chicken, rabbit);
//				break;
				return;
			}
			System.out.println("執行一輪");
			
			rabbit++;
			
			if(rabbit > head) {
				System.out.println("此題無解");
//				break;
				return;
			}
			
		}
		
	}
	
	@Test
	public void nestedLoopBreakTest() {
		a; for(int i =0; i < 10; i+=2) { // 幫迴圈加上標籤名稱，只需要在迴圈前面加-標籤名稱:
			System.out.println(i);
			for(int j = 1; j < 10; j+=2) {
				System.out.println(j);
//				break; // 預設會對最近的迴圈作用，故會跳出 j 的迴圈
				break a; // 若要對外層迴圈作用, 須在外層迴圈加上標籤，再註明此標籤名稱
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}
	
	
	
}
