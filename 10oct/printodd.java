
/*WAJP to print the odd element even position  from the array*/

package Array;

import java.util.Scanner;

public class printodd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements: "); 
	int n=sc.nextInt();  
 
	int[] array = new int[n];  
	System.out.println("Enter the "+n+" elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
		System.out.print("Please enter "+(i+1)+ "  element of the array ");
	array[i]=sc.nextInt(); 
	}
		for(int j=0;j<n;j=j+2) {
			System.out.println("The elemnt at :" +j+ "  postion  "  +array[j]);
			
		}
	
	
	}
}
