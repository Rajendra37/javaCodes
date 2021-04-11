/*
 * Input:
 * 		10, 12, 20, 30, 25, 32, 31, 35, 50, 60
 * Output:
 * 		30, 25, 40, 32, 31, 35
 */

import java.util.Scanner;

public class Questions14mar_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int max = 0;
		int min = 10000;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (array[i] >  max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
			if (i >= 3 && i <= 8) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		System.out.println(max+"  "+min);
	}
}
