package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {

	@Test
	public void dogTest() {
		// �ϥ�����r new �ӫإ߹��(instance)
		Dog myDog = new Dog();
		myDog.running();
		// �]�w�C�ӹ�Ҥ��P���ݩ�(�S��)
		System.out.println(myDog.category);
		System.out.println(myDog.color);
		
		myDog.category = "���";
		myDog.color = "�L����";
		myDog.name = "�Q���`��";
		myDog.age = 1;
		
		System.out.println("�����~��: " + myDog.category);
		System.out.println("�ڮa������v�O " + myDog.color);
		//=====================================
		myDog.run();
		myDog.running();
		myDog.eat("�D�`��");
	}
	
	@Test
	public void bankTest() {
		Bank myBank = new Bank();		
//	    myBank.branch = "xx����";
	    myBank.setUser("AAA");
	    myBank.setBalance(1000);
	    
	    
	    // �s��
//	    myBank.saving(5000);
	    
	    // ����
	    myBank.withdraw(2000);	    	
	}
	
	
	@Test
	public void stringTest() {
		// withdraw31 �O�R�A��k�A�i�H�����z�L ���O�W��.�R�A��k �I�s
		Bank.withdraw31(null, null, null, 0);
		// withdraw3 �O�@���k�A�����n�����O new �X�ӫ�~��I�s
		Bank bank = new bank();
		bank.withdraw31("title", "TTA ����", "AAA", 0);
	}
	
	@Test
	public void bankTest2() {
		Bank bank = new Bank();
		bank.setBranch("TTA");
		bank.getUser("AAA");
		bank.getBalance(1000);
		//========================
		Bank bank1 = new Bank("TTB", "BBB", 2000);
		System.out.println("========================");
	}
	
	@Test
	public void stringTest3() {
		String str = "ABCADAQW";
		String newStr = str.replace("A", "Z");
		String newStr1 = str.replaceAll("A", "Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z");  // replaceAll �i�H�Υ��W��F��regex []:�d�� A-C:�j�gA��j�gC
		System.out.println(newStr2);
	}
	
}
