package com.example.demo11;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5Test {
	
	@Test
	public void mathTest() {
		int a = Math.max(99,2);
		System.out.println(a);
		int b = Math.min(99,2);
		System.out.println(b);
		// 1, 2, 99
		int c = Math.max(1, Math.max(2, 99));  // �n����T�ӭȥH�W���ܡA�ݥ������ӭȡA�o���צA�i��U�@��(�I�s�h�� max/min ����k)
		System.out.println(c);
		
		int d = Math.abs(-1); // �������
		System.out.println(d);
		int e1 = (int) Math.round(3.4);		// �|�ˤ��J
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		int f1 = (int) Math.rint(2.5);  // 2 (0.5) 2.5 (1.5) 4
		int f2 = (int) Math.rint(3.5);  // 2 (1.5) 3.5 (0.5) 4
		System.out.println(f1);
		System.out.println(f2);
		int g1 = (int) Math.ceil(2.5);  
		int g2 = (int) Math.floor(3.5);
		System.out.println(g1);
		System.out.println(g2);
		
		int h1 = (int) Math.sqrt(4);  
		int h2 = (int) Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);
		
		int i = (int) Math.pow(10, 2);  // 10^2
		System.out.println(i);
	}
	
	@Test
	public void stringTest() {
/*		// ����
		String str1 = "123456";
		int a = str1.length();
		System.out.println(a);
		
		// �P�_���e���L�N�q
		String str5 = new String();  // �w�]�Ŧr��
		String str4 = null;  // 		
		String str2 = "";  // �Ŧr��
		String str3 = " ";  // �ťզr��
		System.out.println(str5);
		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		if(str4 != null) {
			boolean b21 = str4.isEmpty();
		}				
		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str2.length(), b1);
		System.out.printf("�r����׬�:%d, isEmpty�����G��:%b\n", str3.length(), b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
		System.out.printf("�r����׬�:%d, isBlank�����G��:%b\n", str2.length(), b3);
		System.out.printf("�r����׬�:%d, isBlank�����G��:%b\n", str3.length(), b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
		System.out.printf("�r����׬�:%d, hasLength�����G��:%b\n", str2.length(), b5);
		System.out.printf("�r����׬�:%d, hasLength�����G��:%b\n", str3.length(), b6);
		System.out.printf("�r����׬�:%d, hasLength�����G��:%b\n", 0, b7);
		boolean b8 = StringUtils.hasText(str2);
		boolean b9 = StringUtils.hasText(str3);
		boolean b10 = StringUtils.hasText(str4);
		System.out.printf("�r����׬�:%d, hasText�����G��:%b\n", str2.length(), b8);
		System.out.printf("�r����׬�:%d, hasText�����G��:%b\n", str3.length(), b9);
		System.out.printf("�r����׬�:%d, hasText�����G��:%b\n", 0, b10);
*/		
//		StringUtils.hasLength(�ܼƦW��) : �P�_ null + isEmpty�A���F�P�_���סA�ٷ|�ۦ�z��null
//		StringUtils.hasText(�ܼƦW��) : �P�_ null + isBlank�A�q�`���D�n�γo��
		
		// �j�M		
 		String s1 = "�p�s�k�P���L�P���P��";
/*		System.out.println(s1.contains("��"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf("��")); // �ѥ���}�l��
		System.out.println(s1.indexOf("��")); // �Y�j�M���쵲�G�|�^��-1
		System.out.println(s1.lastIndexOf("��")); // �ѥk��}�l��
		System.out.println(s1.indexOf("��", 5)); // �ѥ���}�l��
		System.out.println(s1.indexOf("��", 4)); // �ѥ���}�l��
		System.out.println(s1.lastIndexOf("��", 8)); // �ѥk��}�l��
 */
 		
 		// �ഫ��ƫ��A
 		String[] ar1 = s1.split("�P");
 		String[] ar2 = s1.split("");
 		System.out.println(Arrays.toString(ar1));
 		System.out.println(String.join("+", ar1));
 		System.out.println(s1.toCharArray());  // char array�O�}�C�����S�ҡA���|�L�X�O�����m�A�ӥi�H�����C�X���e�ȡA���L�X���G���|
 		System.out.println(Arrays.toString(s1.toCharArray()));
	
		
	}
	
	@Test  // ABCD�r��p��
	public void stringTest2() {
		String str1 = "AABCBDCDACBDA";
		System.out.printf("�r�ꪺABCD�r���ӼƬ�:%d", str1.length());
		System.out.println();
		int a = (str1.indexOf("A",0)); // ���ޭȥ�0�}�l��
		
		System.out.println(a);
	}
	
//	@Test
	public void m1() {
		
		
	}
	
}
