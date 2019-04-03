
public class LeetCode {
	static int[] a = new int[] { 20, 20, 30, 40, 50, 60 };
	static int[] k = new int[2];

	public int[] sum(int[] a, int tar) {
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]+a[j]==tar && i!=j) {
					k[0] = i;
					k[1] = j;
					break;
				}
			}
		}
	

		return k;

	}

	public static void main(String args[]) {
		LeetCode an = new LeetCode();
		int length1 = 40;
		an.sum(a, length1);
		for(int i=0;i<k.length;i++){
			System.out.print(k[i]+" ");
		}
		System.out.println();
	}
}
