package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {
	@Test
	public void reviewLec1() {
		int a;
		String b = "1111";
	}
	public void commentest() {
		// ������
		
		/*
		 * �h�����
		 * �o�ӵ��ѳB�z�覡�i�H���g����h�檺���O
		 */
		this.fileCommentTest(0);
	}
	
	/**
	 * 
	 * @param test �ѥ���ISBN�s��
	 * @return �ѥ��W��
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
	 * test ���t�ƦC�M
	 * @param start �ƦC�_�l��
	 * @param end �ƦC�שl��
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
	 * �D�ؤ�ū�(�����D)
	 * @param x=celsius���
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
	 * �D���ū�(�εؤ�D),����int��double(���p���I)
	 * @param y=fahrenheit�ؤ�
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
	@Test // while�j�� ���t�ƦC
	public void whileLoopTest() {
		int sum = 0;
		int i = 1;
		while(i <= 100) { // �����P�_����
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
	@Test
	public void forloopTest3() {
		int a = this.sum2(1, 111); // int a�i�P�U��a���ƬO�]���U�誺a�O�ϰ��ܼơA����{}��NŪ����F
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
	@Test //�E�E���k	
	public void forLoop1() { //
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%2d ", i, j, i*j); // %d=����Ÿ��A%2d=�e���Ÿ�
			}
			System.out.println(); // �C��@��j�����ᴫ��
			System.out.printf("\n"); // "\n"=����r���A�|�Ť@��
		}
	}
	
	@Test //�E�E���k(while)
	public void whileLoopTest1() {
		int i = 1;
		while( i < 10) { 
			int j = 1; //����for�j��P�_���e��
			while(j<10) { //����for�j��P�_������
				System.out.printf("%d*%d=%2d ", i, j, i*j);
				j++; //����for�j��P�_���ᶵ

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
	
	@Test //���t�ƦC��do while
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
	@Test // Hw ���ߦPŢ �ҥ�p6-18
	public void whileLoop2() {
		int x = 0; // ��
		int y = 0; // ��
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
		System.out.println("����= %d ��, �ߦ�= %d ��%n", x, y);
	}
	
	@Test
	public void ChickenrabbitLoop() { // �i�ζǤJ�Ѽƪ��Ѫk(��kthis...)
		int head = 35;
		int foot = 130;
		
		if(foot%2 == 1) {
			System.out.println("���D�L��");
			return;
		}
		int rabbit = 0; // �ߤl�ƥ�
		
		while(true) {
			
			int chicken = head - rabbit; // �H�ߤl�Ƥϱ������ƶq
			
			if(rabbit*4 + chicken*2 == foot) {
				System.out.printf("�� : ��\n%d : %d\n", chicken, rabbit);
//				break;
				return;
			}
			System.out.println("����@��");
			
			rabbit++;
			
			if(rabbit > head) {
				System.out.println("���D�L��");
//				break;
				return;
			}
			
		}
		
	}
	
	@Test
	public void nestedLoopBreakTest() {
		a; for(int i =0; i < 10; i+=2) { // ���j��[�W���ҦW�١A�u�ݭn�b�j��e���[-���ҦW��:
			System.out.println(i);
			for(int j = 1; j < 10; j+=2) {
				System.out.println(j);
//				break; // �w�]�|��̪񪺰j��@�ΡA�G�|���X j ���j��
				break a; // �Y�n��~�h�j��@��, ���b�~�h�j��[�W���ҡA�A���������ҦW��
			}
			System.out.println("���h�w����");
		}
		System.out.println("�~�h�w����");
	}
	
	
	
}
