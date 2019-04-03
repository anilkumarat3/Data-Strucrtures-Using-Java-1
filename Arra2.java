package DataStructructure;

public class Arra2 {
	int[] a = new int[] { 15, 18, 2,5, 3, 1 };

	public void indes() {
		int NumberRotation = 0;
		int SmallestElement = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < SmallestElement) {
				SmallestElement = a[i];
				NumberRotation = i;
			}

		}
		System.out.println("SmallestElement:" + SmallestElement);
		System.out.println("The Number of Rotation is:" + NumberRotation);
	}

	public void leftRotation() {
		for (int i = 0; i < 2; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("After Rotation Of An Array:");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}

	public void ReversrAlg() {
		int start = 0;
		int end = a.length-1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed Array is:");
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String args[]) {
		Arra2 on = new Arra2();
		on.ReversrAlg();
	}

}
