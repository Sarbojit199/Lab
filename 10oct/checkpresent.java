/*WAJP to find if that element is present in that array or not*/

package Array;

import java.util.Scanner;

public class checkpresent {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements: ");    
	int n=sc.nextInt();  
 int[] array = new int[n];  
	System.out.println("Enter the "+n+" elements of the array: ");  
	for(int i=0; i<n; i++)  
	{   
		System.out.print("Please enter "+(i+1)+ "  element of the array ");
	array[i]=sc.nextInt(); 
	
	} 
	System.out.println("Enter the number you want to search");
	int x=sc.nextInt();
	for(int i=0;i<n;i++) {
		if(array[i]==x) {
			
			System.out.println("Your number have been found at " +i+" position" );
		}
		else {
			System.out.println("Not found");
		}
	}
	
}
}
