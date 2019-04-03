package DataStructructure;

import java.util.Scanner;

public class MatrixPattern {
	private int patternCOde() {
		int MaxSum = 0;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter an Array");
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = SC.nextInt();
			}
		}
		System.out.println("Enter the PAttern Array");

		int[][] PatAaryy = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				PatAaryy[i][j] = SC.nextInt();
			}
		}
		System.out.println("Entered Arayy is:");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Entered Pattern Arayy is:");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(PatAaryy[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int TempSum = 0;
				for (int k = 0; k < (6 - 3); k++) {
					for (int l = 0; l < (6 - 3); l++) {
						if (PatAaryy[k][l] == 1) {
							TempSum = TempSum + a[i][j];
						}

					}
				}
				if (TempSum > MaxSum) {
					MaxSum = MaxSum;
				}
			}
		}

		return MaxSum;
	}

	public static void main(String args[]) {
		MatrixPattern ob = new MatrixPattern();
		int MaxSum = ob.patternCOde();
	}

}
