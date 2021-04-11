/*
 * Use toCharArray() and String.valueof() - I don't know its best practice or not
 * 
 * Input: 
 * Today is sunday , its holiday
 * day
 * 
 * output: 3
 * 
 */


import java.util.Scanner;

public class Questions11mar_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter String to be searched: ");
		String check = sc.nextLine();
		String st = caseCheck(str);
		String chec = caseCheck(check);
		checkForLetter(st, chec);
	}

	private static String caseCheck(String st) {
		// TODO Auto-generated method stub
		char[] st1= st.toCharArray();
		for (int i = 0; i < st1.length; i++) {
			if ((int)st1[i] < 65 && (int)st1[i] > 90)
				st1[i] = (char)((int)st1[i] + 32);
		}
		return String.valueOf(st1);
	}

	private static void checkForLetter(String str, String check) {
		// TODO Auto-generated method stub
		int count = 0;
		char[] first = str.toCharArray();
		char[] second = check.toCharArray();
		for (int i = 0; i < (first.length - second.length - 1); i++) {
			for (int j = 0; j < second.length; j++) {
				if(first[i+j] == second[j]) {
					count += 1;
				}
			}
		}
		if(str.length() > 0)
			System.out.println((count / second.length) + 1);
		else
			System.out.println("0");
	}

}
