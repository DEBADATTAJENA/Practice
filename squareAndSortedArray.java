package hearth;

import java.util.Arrays;


public class squareAndSortedArray {

	public static void main(String[] args) {
		
	      int [] arr = {-4,-1,0,3,10};
	      int square = 0;
	      int temp = 0;
	     int [] sarr = new int [arr.length];
	    	for(int i=0;i<arr.length;i++) {
	    		square = arr[i]*arr[i];
	    		sarr[i] = square;
	    	}
	    	Arrays.sort(sarr);
	     System.out.print(Arrays.toString(sarr));
	}
}
