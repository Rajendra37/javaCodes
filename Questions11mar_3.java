/*
 * I have a question to ask in this program
 * for return 
 * 
 * Input: 
 * 1 2 4 
 * 3 5 6
 * 7 8 9
 * 
 * Output:
 * 5 6
 *
 */


import java.util.Scanner;

public class Questions11mar_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of 2d array rows and columns");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int array[][] = new int[rows][columns];
		System.out.println("Enter array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int res = 0;
		int lenght = 0;
		for (int i = 0; i < rows; i++) {
			if (oddChecker(array[i][i])>0) {
				res += oddChecker(array[i][i]);
				lenght += 1;
			}
		}
		System.out.print("Fist Diagonal: ");
		System.out.println(res/lenght);
		
		res = 0;
		lenght = 0;
		for (int i = 0; i < rows; i++) {
			if (oddChecker(array[i][(rows-1)-i])>0) {
				res += oddChecker(array[i][(rows-1)-i]);
				lenght += 1;
			}
		}
		System.out.print("Fist Diagonal: ");
		System.out.println(res/lenght);
	}

	private static int oddChecker(int a) {
		// TODO Auto-generated method stub
		return a % 2 != 0 ? a : 0;
	}

}
