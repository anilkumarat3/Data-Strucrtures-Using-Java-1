
public class Array2 {
	public static void main(String args[]) {
		int[] a = new int[] { 10, 20, 5, 15, 2, 3 };
		int n = a.length;
		System.out.println("Sorting of an Array element");
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n -i- 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array Is:");
		for (int k = 0; k < n; k++) {
			System.out.println(a[k]);
		}
	}

}
