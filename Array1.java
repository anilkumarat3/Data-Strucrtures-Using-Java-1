package DataStructructure;

public class Array1 {
	int MaxSum = 0;
	// int TempSum = 0;

	int[] a = new int[] { 8,3,1,2 };

	public void maxsum() {

		for (int j = 0; j < 4; j++) {
			int TempSum = 0;

			int temp = a[0];
			for (int k = 0; k < a.length - 1; k++) {
				a[k] = a[k + 1];
			}
			a[a.length - 1] = temp;
			for (int l = 0; l < a.length; l++) {
				System.out.println(a[l]);
				TempSum = TempSum + (a[l] * l);
			}
			// TempSum = TempSum + (a[j] * j);

			System.out.println("TempSum:" + TempSum);
			System.out.println("------------------------------");
			if (TempSum > MaxSum) {
				MaxSum = TempSum;
			}
		}
		System.out.println("MAximum Sum Of Rotational Array is: " + MaxSum);

	}

	public static void main(String args[]) {
		System.out.println("Inside main:");
		Array1 obj = new Array1();
		obj.maxsum();
	}

}
