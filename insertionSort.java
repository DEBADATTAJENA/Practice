package hearth;

public class insertionSort {

	public static void main(String[] args) {
		int[] a = {25,6,45,12,84,65};
		int item,j;
		for(int i=1;i<a.length;i++) {
			 item= a[i];
			 j = i-1;
			while ((j>=0) && (a[j]>item)) {
				a[j+1]=a[j];
				j = j-1;
			}
			a[j+1] = item;
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
