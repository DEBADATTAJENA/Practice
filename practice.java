package hearth;

import java.util.Scanner;

/* left rotation on an array by an index (k)
 * without using any extra space.
 */
public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int [] arr = {1,2,3,4,5,7};
		for(int i=0;i<k;i++){
		
			int first = arr[0];
			for( int j =0;j<arr.length-1;j++) {
				
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
			
			
		}
		for(int i =0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	 }
}