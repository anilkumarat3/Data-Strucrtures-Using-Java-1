package DataStructructure;

import java.util.Scanner;

public class twodArray {
	int[] a = new int[] { 2, 3, 4, 5, 6, 4, 6, 7, 8, 9, 2, 3, 4 };

	public void calSum() {
		int max = 0, sum = 0;
		int start = 0, end = 0;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter an Size of the Subarray");
		int n = SC.nextInt();
		for (int i = 0; i < a.length - n; i++) {
			sum = 0;
			start = i;
			end = i + n;
			for (int k = start; k < end; k++) {
				sum = sum + a[k];
			}
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("Maximum Sum is-->  " + max + " Array Start From  " + start + " And " + end);
		for (int i = start; i < end; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public void ForTwoDimensionalArray() {
		int[][] b = new int[5][5];
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Two DImensional Aarry");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i][j] = SC.nextInt();
			}
		}
		System.out.println("Entered Matrix Array is:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the Size of the Matrix:");
		int lop = SC.nextInt();
		
		
		int TempSum = 0;
		int MaXSum = 0;
		int Irow = -1;
		int ICol = -1;
		
		for (int i = 0; i < 5 - lop; i++) {
			for (int j = 0; j < 5 - lop; j++) {
				TempSum = 0;
				for (int k = 0; k < lop; k++) {
					for (int l = 0; l < lop; l++) {
						TempSum = TempSum + b[k][l];
					}

				}
				if (TempSum > MaXSum) {
					MaXSum = TempSum;
					Irow = i;
					ICol = j;
				}
			}
		}
		System.out.println("MAtrix Containg MAximum Sum is" + MaXSum);
		for (int i = Irow; i < (Irow + lop); i++) {
			for (int j = ICol; j < (ICol + lop); j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		twodArray ab = new twodArray();
		ab.ForTwoDimensionalArray();
	}

}
