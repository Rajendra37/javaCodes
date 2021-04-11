/*
 * Input:
 * 		I am good bye.
 * Output:
 * 		miimum: I
 * 		MAximum: good
 */

import java.util.Scanner;

public class Questions14mar_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String sentence = sc.nextLine();
		String[] str = sentence.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Minimum lenght: "+str[str.length - 1]);
		System.out.println("Maximum lenght: "+str[0]);
	}
}
