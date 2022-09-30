/*Java program to find all pairs of elements in an array whose sum is 
equal to a specified number*/

package Array;

import java.util.Scanner;

public class findsum {

	public static void main(String[] args) {
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
		System.out.println("Enter the number you want to find");
		int find=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]+array[j]==find) {		//if both array sum is equal to the number has to be find then print both number
					System.out.println(array[i]+" "+array[j]);
				}
			}
		}

	}

}
