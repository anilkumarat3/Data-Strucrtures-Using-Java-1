package DataStructructure;

public class Rearrangement {
	int[] a = new int[] { 5, 2, 4, 6, 8, 12, 7, 15 };

	public void Reagg() {
		System.out.println("Find the MAximum Element:");
		int max=0;
		for(int l=0;l<a.length;l++){
			if(a[l]>max){
				max=a[l];
			}
		}
		System.out.println("MaxElement is:"+max);
		int[] MaxArray=new int[max];
		
		for (int k = 0; k < MaxArray.length - 1; k++) {
			
			for (int i = 0; i < a.length - 1; i++) {
				if (k==a[i]) {
                 MaxArray[k]=a[i];
				}
				else if(k!=a[i]) {
					MaxArray[k]=-1;
				}else{
					
				}
			}
		}
		System.out.println("Final Array Elements are");
		for(int y=0;y<MaxArray.length;y++){
			System.out.print(MaxArray[y]+" ");
		}
		System.out.println();
		

	}

	public static void main(String args[]) {
		System.out.println("Inside Main:");
		Rearrangement obj = new Rearrangement();
		obj.Reagg();
	}

}
