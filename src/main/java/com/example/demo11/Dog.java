package com.example.demo11;

public class Dog {
	//�ŧi�ݩ�(�S��)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	
	
	//�w�q��k(�欰)	
	public void run() {
		System.out.println("���b�]!");		
	}
	
	// ��k���h��(overload)
	
	// 1.��k�W�٤@�ˡA���O��k�����ѼƭӼƤ��@�ˡA�I�s run ��k�ɥi�H��O�O�I�s�L�Ѽƪ��٬O���Ѽƪ���k
	public void run(String name) {
		System.out.println(name + "���b�]!");		
	}
	
	// 2.��k�W�٤@�ˡA��k�����ѼƭӼƤ@�ˡA���O�ۦP��m���ѼƸ�ƫ��A���@��
	public void run(int age, String category) {
		System.out.println(category + "���b�]!");		
	}
	
	public void run(String category, int age) {
		System.out.println(category + "���b�]!");		
	}
	
	//
	
	public void running() {
		System.out.println(name + "���b�]!");		
	}
	
	public void eat(String name) {
		// �L�X:�Q���`��ܷR�Y�ܦ��D�`��
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);		
	}


}

/*
 * public class Bank {
	
	// �ᤩbranch �s���w�]�ȡA�Ӥ��O�{���������w�]�� null
	private String branch = "xx����"; // ����W�� �B private(�ݩ�: �p�H)

	private String user; // �Τ�W��

	private int balance; // �s�ھl�B

	// �إ��ݩʪ��s(get)��(set)��k (***���n!!!***)

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
		this.user = user; // �۷�� bank.user = ""; 
		// this.user �����O Bank ��(class)
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// �s�ڤ�k
	public void saving(int amount) {
		System.out.println("�s�ګe�l�B: " + balance);
		// �쥻�����B + �s�ڪ��B
		balance += amount; // balance = balance + amount;
		System.out.println("�s�ګ�l�B: " + balance);
	}

	// ���ڤ�k
	public void withdeaw() {
		System.out.println(user + "");
	}

}

 * 
 */
