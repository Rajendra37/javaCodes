/*
 * Input: 1 2 3
 * 		  4 5 6
 *		  7 8 9
 *
 *Output: 
 *		9 2 3
 *		4 5 6
 *		7 8 9
 */

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of 2d array rows and columns");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int array[][] = new int[rows][columns];
//		int check[] = new int[rows*columns];
		System.out.println("Enter array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		
		double max = array[0][0], min = array[0][0];
		int maximumI1 = 0, maximumi2 = 0, minimumI1 = 0, minimumI2 = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					maximumI1 = i;
					maximumi2 = j;
				}
				if (array[i][j] < min){
					min = array[i][j];
					minimumI1 = i;
					minimumI2 = j;
				}
			}
		}
//		Swapping
		int temp = array[maximumI1][maximumi2];
		array[maximumI1][maximumi2] = array[minimumI1][minimumI2];
		array[minimumI1][minimumI2] = temp;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
//		Swapping diagonal with first row
/*
 * load all el
 * check wheather [0][0], [1][1], [2][2] => [0][0], [0][1], [0][2]
 * 
 */
		System.out.println("Running...");
		int temp1[] = new int[rows];
		for (int i = 0; i < array.length; i++) {
			temp1[i] = array[i][i];
			array[i][i] = array[0][i];
		}
		for (int i = 0; i < temp1.length; i++) {
			array[0][i] = temp1[i];
			
			
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
