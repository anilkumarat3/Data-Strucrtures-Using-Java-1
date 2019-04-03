import java.util.Scanner;

public class Array1 {
	public static void main(String args[]) {
		int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
		System.out.println("Array Rotation");
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Number of Rotation:");
		int Number_Rotation = SC.nextInt();
		/*int temp[] = new int[Number_Rotation];
		for (int i = 0; i < Number_Rotation; i++) {
			temp[i] = a[i];
		}
		System.out.println("Temprovary array is:");
		for (int h = 0; h < temp.length; h++) {
			System.out.println(temp[h]);
		}
		for (int y = 0; y < Number_Rotation; y++) {
			for (int k = 0; k < a.length - 1; k++) {
				a[k] = a[k + 1];
			}
		}
		System.out.println("After Temp");
		for (int h = 0; h < a.length; h++) {
			System.out.println(a[h]);
		}
		int cur = Number_Rotation;

		for (int l = a.length - 1; l > a.length - 1 - Number_Rotation; l--) {

			a[l] = temp[cur - 1];
			cur--;
		}*/
		for(int i=0;i<Number_Rotation;i++){
			int temp=a[0];
			for(int i1=0;i1<a.length-1;i1++){
				a[i1]=a[i1+1];
			}
			a[i]=temp;
		}
		System.out.println("Rotated Array is:");
		for (int t = 0; t < a.length; t++) {
			System.out.println(a[t]);
		}
	}

}
