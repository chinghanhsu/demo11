package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {

	@Test // ���j�m�� 1�[��~100
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		// ���Ѩ�̤p���D�ɡA�����Ǧ^����
		if (x == 1) {
			return 1;
		}
		// �C�@�������׷|�O�쥻�Ƕi�Ӫ��Ѽ� + �H(�Ѽ�-1)�өI�s����k�����G
		// �{���X���ۤv�I�s�ۤv�A�N�٬����j
		int sum = x + this.recurrence(x - 1);
		return sum;
		// return x +this.recurrence
	}

	@Test
	public void ifTest() {
		String weather = "�U�B";
		// if...
		if (weather == "�U�B") { // �p�ŦX�Y����
			System.out.println("�a�B��");
		}
		System.out.println("���αa��"); // ���槹if�������e��A�|���۩��U����{���X

		// if...else...
		if (weather == "�U�B") { // �p�ŦX
			System.out.println("�a�B��"); // �Y����
		} else { // �_�h
			System.out.println("���αa��"); // ����else�᪺���e
		}

		// if...else if...else...
		if (weather == "�U�B") { // �p�ŦX�Y����
			System.out.println("�a�B��");
		} else if (weather == "�j�Ӷ�") { // �_�h�A�p�ŦXelse if �Y����
			System.out.println("������");
		} else { // �_�h����
			System.out.println("������a����F��");
		}

		int a = 15;

	}

	@Test // �����p��
	public void iftest2() {
		double x = this.price(85); //
//		System.out.println(x);  //
		System.out.printf("����: %d��", (int) x); // %d����Ʀ���(����Τp���I)�A%s���r�����
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

	@Test // 1a2b�C��
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

	@Test // �q�Ʀr
	public void guessNumberPrepare() {
		// *****�ù���J
		System.out.println("�п�J�Ʀr");
		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.println("�z��J���Ʀr�O:"+ i);
		String str2 = scan.nextLine();
		System.out.println("�z��J�����e�O:" + str2);
		char ch = str2.charAt(2);
		System.out.println("");

	}

	@Test
	public void guessNumbertest() {

		Random ran = new Random();
		int x = ran.nextInt(2, 99);
		int a = 1;
		int b = 99;
		System.out.println("�вq�Ʀr");
		Scanner scan = new Scanner(System.in);
		for(;;) {
						
			int i = scan.nextInt();
			if(i<1 || i>99) {
				System.out.printf("�п�J1~99���������\n");
			}						
			if (i < x && i>=1) {
//			if (0 < i < x ) {	
				System.out.printf("�Цb%d~%d�d�򤺲q�ӼƦr\n", i , b);
				a = i;
			}
			if (i > x && i<=99) {
				System.out.printf("�Цb%d~%d�d�򤺲q�ӼƦr\n", a , i);
				b = i;
			}
			if (i == x) {
				System.out.println("���ߵ���");
				break;
			}
		}
		

	}
}
