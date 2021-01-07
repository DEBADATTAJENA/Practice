package hearth;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[] a = {1,2,3,4,5};
		int noofrotation = S.nextInt();
		int splitingpoint = noofrotation;
		int[] b = new int[a.length];
		int i=0;
		while(splitingpoint<a.length) {
			b[i]=a[splitingpoint];
			i++;
			splitingpoint++;
		}
		splitingpoint = 0;
		while(splitingpoint<noofrotation) {
			b[i]=a[splitingpoint];
			i++;
			splitingpoint++;
		}
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
	}

}
