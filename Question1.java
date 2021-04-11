/*
 * !0th mar 1st Question
 * Input
 * Array1: {10, 67, 1}
 * Array 2: {16, 8, 90}
 * output : {-6, 59, -89
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter First Array Size: ");
		int n1 = sc.nextInt();
		int[] array1 = new int[n1];
		System.out.println("Enter First Array: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter Second Array Size: ");
		int n2 = sc.nextInt();
		int[] array2 = new int[n2];
		System.out.println("Enter Second Array: ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array1[i] - array2[i]);
		}
		
	}

}
