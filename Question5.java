/*
 * array : {apple, mango, banana}
 * array2 =mango
 * Output : Yes
 */

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Fruits:");
		int n = sc.nextInt();
		String fruit[] = new String[n];
		System.out.println("Enter Fruits:");
		for (int i = 0; i < n; i++) {
			fruit[i] = sc.next();
		}
		System.out.println("Enter Fruit to be searched: ");
		String fruit2 = sc.next();
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i].equals(fruit2)) {
				System.out.println("Yes");
				break;
			}
			else {
				System.out.println("No");
				break;
			}
		}
	}

}
