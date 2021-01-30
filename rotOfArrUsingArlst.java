package hearth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class rotOfArrUsingArlst {

	public static void main(String[] args) {
		  int [] arr = new int [] {4,5,6,7,8,9};  
	       int n =1;
	       ArrayList<Integer> al = new ArrayList<Integer>();
	     for (int i=n;i<arr.length;i++) {
	    	 al.add(arr[i]);
	    	 
	     }
	     for(int i=0;i<n;i++) {
	    	 al.add(arr[i]);
	     }
	    for(int i = 0;i<al.size();i++)
	    {
	    	System.out.print(al.get(i));
	    	}  
	    }
	}  