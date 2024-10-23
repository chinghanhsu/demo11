package com.example.demo11;

public class Bank2 extends BasicInfo {
	
	private String branchTitle;
	
	private int balance;
	
	public Bank2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank2(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public Bank2(String branchTitle, int balance) {
		super();
		this.branchTitle = branchTitle;
		this.balance = balance;
	}

	

	public String getBranchTitle() {
		return branchTitle;
	}

	public int getBalance() {
		return balance;
	}

}
