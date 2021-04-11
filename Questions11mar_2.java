/*
 * Input:
 * 		wel123come
 * 		2goodbye45
 * 
 * Output:
 * 		12345
 * 		welcomgdby
 */

import java.util.Scanner;

public class Questions11mar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence 1: ");
		String sent1 = sc.nextLine();
		System.out.println("Enter a sentence 2: ");
		String sent2 = sc.nextLine();
		char[] first = new char[sent1.length() + sent2.length()];
		char[] second = new char[sent1.length() + sent2.length()];
		int j = 0, k = 0;
		for (int i = 0; i < sent1.length(); i++) {
			if(sent1.charAt(i) > 48 && sent1.charAt(i) <= 58) {
				first[j] = sent1.charAt(i);
				j++;
			}
			else {
				second[k] = sent1.charAt(i);
				k++;
			}
		}
//		j = 0; 
//		k = 0;
		for (int i = 0; i < sent2.length(); i++) {
			if(sent2.charAt(i) > 48 && sent2.charAt(i) <= 58) {
				first[j] = sent2.charAt(i);
				j++;
			}
			else {
				second[k] = sent2.charAt(i);
				k++;
			}
		}

		System.out.println(String.valueOf(first));
		System.out.println("Number String with no duplicates");
		doubleChecker(String.valueOf(first));
		System.out.println();
		System.out.println(String.valueOf(second));
		System.out.println("Character String with no duplicates");
		doubleChecker(String.valueOf(second));
	
	}

	private static void doubleChecker(String value) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < value.length(); i++) {
			if (temp.indexOf(value.charAt(i)) == -1) {
				temp = temp + value.charAt(i);
			}else {
				temp.replace(String.valueOf(value.charAt(i)), "");
			}
		}
		System.out.println(temp+" ");
	}

}
