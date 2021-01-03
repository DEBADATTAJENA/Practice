package hearth;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String[] a = {"arup","karup","dabloo","sawzid","jugnu"};
		int totalSwaps = 0;
		
			
		
		for (int i=0;i<a.length;i++) {
			int noofSwaps=0;
			for (int j=0;j<a.length-1-i;j++) {
				if (a[j].compareTo(a[j+1])>0) {
					String temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					noofSwaps++;
					
				}
				 
			}
			
			if (noofSwaps==0) {
				break;
			}
			
		
		}
		for(int i=0;i<a.length;i++) {
			
		
			System.out.print(a[i]+" ");
		   
		} 
	}
}