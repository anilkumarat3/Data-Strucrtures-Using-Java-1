
public class ArrayReverse {
	public static int[] revers(int Arr[], int n) {
		int start = 0;
		int end = n - 1;
		while (start < end) {
			int temp = Arr[start];
			Arr[start] = Arr[end];
			Arr[end] = temp;
			start++;
			end--;

		}
		return Arr;

	}

	public static void main(String args[]) {
		int[] Arr = new int[] { 1, 2, 3, 4, 5 };
		int[] res=new int[Arr.length];
		int n = Arr.length;
		res=revers(Arr, n);
		System.out.println(res);
		for (int i = 0; i < n; i++) {
			System.out.println(res[i]);
		}

	}

}
