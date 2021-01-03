package hearth;

public class selectionSorting {

	public static void main(String[] args) {
		int[] a = {12,63,15,94,54,11,6};
		int min;
		for (int i = 0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
				
			}
			int temp =a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
