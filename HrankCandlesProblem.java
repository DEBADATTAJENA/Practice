package hearth;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      int [] arr = {2,3,4,4,3,4,5,6,3,4,4};
	      int Max = 0;
	     
	      for(int i =0;i<arr.length;i++) {
	    	  int count = 1;
	    	  for(int j =i+1;j<arr.length;j++) {
	    		  if(arr[i]==arr[j]) {
	    			  count++;
	    		  }
	    	  }
	    	  if(Max<count) {
	    		  Max = count;
	    	  }
	    	  
	      }
	      System.out.println(Max);
	    
	
	      
	      
	      
	      
	}
}