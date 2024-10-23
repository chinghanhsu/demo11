package com.example.demo11;

public class Dog {
	//宣告屬性(特性)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	
	
	//定義方法(行為)	
	public void run() {
		System.out.println("正在跑!");		
	}
	
	// 方法的多載(overload)
	
	// 1.方法名稱一樣，但是方法中的參數個數不一樣，呼叫 run 方法時可以辨別是呼叫無參數的還是有參數的方法
	public void run(String name) {
		System.out.println(name + "正在跑!");		
	}
	
	// 2.方法名稱一樣，方法中的參數個數一樣，但是相同位置的參數資料型態不一樣
	public void run(int age, String category) {
		System.out.println(category + "正在跑!");		
	}
	
	public void run(String category, int age) {
		System.out.println(category + "正在跑!");		
	}
	
	//
	
	public void running() {
		System.out.println(name + "正在跑!");		
	}
	
	public void eat(String name) {
		// 印出:霸氣的總柴很愛吃變成胖總柴
		System.out.println(this.name + "很愛吃變成" + name);		
	}


}

/*
 * public class Bank {
	
	// 賦予branch 新的預設值，而不是程式本身的預設值 null
	private String branch = "xx分行"; // 分行名稱 、 private(屬性: 私人)

	private String user; // 用戶名稱

	private int balance; // 存款餘額

	// 建立屬性的存(get)取(set)方法 (***重要!!!***)

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user; // 相當於 bank.user = ""; 
		// this.user 指的是 Bank 的(class)
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款方法
	public void saving(int amount) {
		System.out.println("存款前餘額: " + balance);
		// 原本的金額 + 存款金額
		balance += amount; // balance = balance + amount;
		System.out.println("存款後餘額: " + balance);
	}

	// 提款方法
	public void withdeaw() {
		System.out.println(user + "");
	}

}

 * 
 */
