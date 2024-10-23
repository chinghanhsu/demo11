package com.example.demo11;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec4Test {

	@Test
	public void listTest() {
		// �ŧi
		List<String> list1 = Arrays.asList("1", "2"); // �L�k�W�R����
		List<Integer> list2 = List.of(99, 100); // �L�k�ק�
		List<Character> list3 = new ArrayList<>(); // �i�H���N�ק�A�`��
		List<String> list7 = new ArrayList<String>(); // �᭱�����A���̼˥i�H��J��ƫ��A�A���]���ܳ·СA�q�`���|�g
		List<String> list8 = new ArrayList<>(list1); // �ŧi�P�ɵ���
//		System.out.println(list8.get(0));

		// �ϥ� ArrayList �~����ק� List �����e
		list8.add("3");
		System.out.println(list8.get(0));
		list8.remove("1");
		System.out.println(list8.get(0));

		// Q ������O new ArrayList ?
//		List<Character> list5= new List<>();
		// A �]�� list �O interface ����Ʈ榡�A�G��S�������@(��ڪ��ާ@�B�J)�A�L�k�Q�Ы�
		// �p�G�չ� new List �|�ɭP���~
//		list3 = new LinkedList<Character>();
		// Q �����򤣨ϥ� ArrayList �Ӹ� new ArrayList �����G?
//		ArrayList<Character> list4= new ArrayList<>();
//		list4 = new LinkedList<Character>();
		// A (1) �]��ArrayList �O��@ List �̭��w�q�n����k�A�GArrayList �i�H�Q�����O List ���@��
		// �G List ���|�� ArrayList ���ƥ������A�i�H�˶i ArrayList
		// ==> �u�n�O��@ interface �����O(class)�A���i�H�� interface �@����e��(�ܼ�)����ƫ��A
		// (2) �]�� interface �i�H�Q�h�����O��@�A��� interface �ӻ��A���P��@���O�L���@��
		// �]�藍�P��@(class)�ӻ��A���������۳q�A�G�S����k�˶i�����̭�
		// �]���ĥ� interface �@���e������ƫ��A�A�i�H�Ӹ˦U���U�˪���@���O(class)

//		System.out.println(list1.get(1));
		// Arrays.asList �M List.of �����׵L�k�ܧ�A�Y���ϥ� add(�s�W) �� remove(�R��)�A�N�|����
//		list1.add("3");
	}

	/*
	 * public double avgWeatherByList(List<Double> weatherList) { double sum = 0;
	 * for(int i = 0; i < weatherList.size(); i++) { sum += weatherList.get(i); }
	 * return sum / weatherList }
	 */

	@Test
	public void arrayTest() {

		// �ŧi�}�C
		int[] arr1 = new int[7]; // ��«ŧi
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7]; // ��«ŧi
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 }; // �ŧi�P�ɵ���

		// ��ŧi���}�C���e�ȳ��|�Onull�ιw�]��(�p�ŧi�ɨS�����)
		System.out.println(arr1[0]); // �p�G�ϥΰ򥻸�ƫ��A�ŧi�A�|�۰����A�˶i�w�]��
		System.out.println(arr1Class[0]); // �p�G�ϥ����O���A�ŧi�A���|���w�]�ȡA�|�O�Ū�
		System.out.println(arr2[7]); // �]�����ޭȬO�q 0 �}�l�A�G���׬� 7 �ɡA���ޭȷ|�b 0~6�A�{���䤣����ޭȬ� 7 ����l�A�N�|����

		// ���
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

		System.out.println(weatherData.toString()); // �u�n���O�򥻸�ƫ��A�ܼƸ̭��N�|�O�O�����m�A�G�������ܼƦW���ഫ���r��A�|�L�X
		System.out.println(Arrays.toString(weatherData)); // �ݭn�ϥ� Arrays ���Ѫ���k�~�ॿ�T�L�X���e��

		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) { // �}�C�����ޭȳ̤j < ���סA�]�����ޭȥû����|�O����-1
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	@Test // ���ƽm��
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

	@Test // ���ƽm��(�U��)
	public void practiceTest() {
		int[] score = { 60, 61, 62, 59, 58 };
		this.avgScore(score);

	}

	public double avgScore(int[] score) {
		System.out.println("�z��J���}�C��:" + Arrays.toString(score));
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

	@Test // 0�}�Y�|���H���ƥͦ�
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
		 // �M��
		for(int num2 : list) {
			System.out.print(num2);
		}

	}
}
