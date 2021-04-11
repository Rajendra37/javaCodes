/*
 * Used toCharArray() -
 */

/* Input: I am good boy
 * Output: I an goof boz
 * 
 */


import java.util.Scanner;

public class Question4 {

	public static void nextElement(String st) {
		char[] myString = st.toCharArray();
		for (int i = 0; i < myString.length; i++) {
			if ((myString[i] == 'a' || myString[i] == 'e' || myString[i] == 'i' || myString[i] == 'o' || myString[i] == 'u')){
				if ( myString[i+1] != 'a' || myString[i+1] != 'e' || myString[i+1] != 'i' || myString[i+1] != 'o' || myString[i+1] != 'u') {
					if (myString[i+1] != ' ') {
						myString[i+1] = (char)((int)myString[i+1]+1);
					}
				}
			}
			System.out.print(myString[i]);
		}
	}

//		int len = st.length();
//		for (int i = 0; i < len; i++) {
////			Character c = myString[i];
//			if ((myString[i] == 'a' || myString[i] == 'e' || myString[i] == 'i' || myString[i] == 'o' || myString[i] == 'u') && ( myString[i+1] != 'a' || myString[i+1] != 'e' || myString[i+1] != 'i' || st.charAt(i + 1) != 'o' || myString[i+1] != 'u')){
////				myString[i+1] = (int)myString[i+1];
//				int n = (int)myString[i+1];
//				st.replace(i+1, 1, (char)n);
//			}
//		}
//		System.out.println(st);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String st = sc.nextLine();
		nextElement(st);	
	}
}
