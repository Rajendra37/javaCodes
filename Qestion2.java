/*
 * 10Mar Question 2
 * Input: {9, 2, 89, 7, 15}
 * Output: {2, 7, 9, 15, 89}
 * Output2: {2, 7, 89}
 */

import java.util.Scanner;

public class Qestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		System.out.println("Enter Array: ");
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		array = insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		primeNumber(array);
		
	}

	private static void primeNumber(int[] array) {
		// TODO Auto-generated method stub
		boolean Prime = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				Prime = false;
			}
			else {
				for (int j = 2; j < array[i] / 2; j++) {
					if (array[i] % j == 0) {
						Prime = false;
						break;
					}
				}
			}
			if(Prime) {
				System.out.println(array[i] + " ");
			}
		}
	}

	private static int[] insertionSort(int[] array) {
		// TODO Auto-generated method stub
		int len = array.length;
		for (int i = 0; i < len; i++) {
			int val = array[i];
			int j = i -1;
			while(j >= 0 && array[j] > val) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = val;
		}
		return array;
	}

}
