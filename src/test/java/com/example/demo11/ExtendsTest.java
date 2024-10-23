package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	
	@Test
	public void test() {
		int a = 5;
		int b = ++a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = b++;
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	@Test
	public void animal() {
		Animal ani = new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void animal2() {
		Animal ani = new Animal("ANI", 5);
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void birdTest() {
		Bird bird = new Bird();
		bird.setName("BIRD");
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	
	@Test
	public void birdTest2() {
		Bird bird = new Bird("BIRD", 5);
		bird.eat();
		bird.sleep();
		bird.flying();
		bird.flying2();
	}
	
	@Test
	public void birdTest3() {
		// ���M���^�Ӫ���ƫ��A�O�����O�A���]�� new �X�Ӫ�����O�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("BIRD", 5);
		// eat() �M sleep() ���檺�|�O�b�l���O�����s�w�q��@���e
		bird.eat();
		bird.sleep();
		// �H�U2�Ӥ�k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O��
//		bird.flying();
//		bird.flying2();
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��Ҩ䱵���쪺��ƫ��A�O�����O��
		// 1. �u��I�s�w�q�b�����O������k
		// 2. ��l���O�����s�w�q�����O����k�ɡA���檺�|�O�l���O����@���e
	}
	
	@Test
	public void birdTes4() {
		Bird bird = new Bird("BIRD", 5);
		// ����w�q�b Bird ������@���e
		bird.flying();
		// ���s�w�q flying() ��k
		// 1. �b�إ߷s����Үɪ��������s����@���e�A�Y�[�W�j�A��
		// 2. �j�A���n�g�b�������e�A�B�����@�w�n������
		// 3. ���s�w�q����@���e�N�Ȧ��b�o������
		// 4. @Override �i���i�L�A����ĳ�[
		Bird bird2 = new Bird("BIRD", 5) {
			@Override
			public void flying() {
				System.out.println("�³��C��");
			}			
		};
		bird2.flying();
	}

	
	@Test
	public void sonTest() {
		Son son = new Son("Alex");
		son.walk();
		son.playball();
	}
	
	@Test
	public void daughterTest() {
		Daughter daughter = new Daughter("Ann");
		daughter.walk();
		daughter.shopping();
	}
	
	
	@Test // 1023
	public void runTest() {
		
		
	}


}
