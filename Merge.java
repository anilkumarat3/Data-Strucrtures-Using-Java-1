package DataStructructure;

import java.util.Scanner;

public class Merge {
	public void merges() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int ROw = sc.nextInt();
		System.out.println("Enter COl Number");
		int Col = sc.nextInt();
		int[][] Mat = new int[ROw][Col];
		System.out.println("Enter Sliptted Array in the Form of Matrix:");
		for (int i = 0; i < ROw; i++) {
			for (int j = 0; j < Col; j++) {
				Mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("ENterd Matrix is:");
		for (int i = 0; i < ROw; i++) {
			for (int j = 0; j < Col; j++) {
				System.out.print(Mat[i][j] + " ");
			}
			System.out.println();
		}
		// new TEmarry
		int[] TempArray = new int[ROw * Col];
		int k = 0;
		while (k < TempArray.length - 1) {
			// for (int k = 0; k < TempArray.length; k++) {
			for (int i = 0; i < ROw; i++) {
				for (int j = 0; j < Col; j++) {
					TempArray[k] = Mat[i][j];
					k++;
				}
			}
		}
		// }
		System.out.println("Array in Single Dimension is:");
		for (int l = 0; l < TempArray.length; l++) {
			System.out.print(TempArray[l] + " ");
		}
		System.out.println();
		System.out.println("Inside Sorting");
		for (int x = 0; x < TempArray.length - 1; x++) {
			for (int y = 0; y < TempArray.length - 1 - x; y++) {
				if (TempArray[y] > TempArray[y + 1]) {
					int temp = TempArray[y];
					TempArray[y] = TempArray[y + 1];
					TempArray[y + 1] = temp;
				}
			}
		}
		System.out.println("After Sorting An Array:");
		for (int i = 0; i < TempArray.length; i++) {
			System.out.print(TempArray[i] + " ");
		}
		System.out.println();
	}

	public void Suufule() {
		int[] a = new int[] {11,13,15,12,14,16,7};
		// find the Begining of the Second Arrayut
		int Split = a.length / 2;
		System.out.println(Split);
		int i = Split;
		int[] temp = new int[a.length];
		for (int i1 = 1; i1 < temp.length; i1 = i1 + 2) {
			temp[i1] = a[i];
			i++;

		}
		int stat = 0;
		while (stat < Split) {
			for (int i1 = 0; i1 < temp.length; i1 = i1 + 2) {
				temp[i1] = a[stat];
				stat++;
			}
		}
		System.out.println("Suufulled Array is:");
		for (int i1 = 0; i1 < temp.length; i1++) {
			System.out.print(temp[i1] + " ");
		}
		System.out.println();

	}

	public static void main(String args[]) {
		Merge om = new Merge();
		// om.merges();
		om.Suufule();
	}

}
