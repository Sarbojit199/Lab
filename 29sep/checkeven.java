/*Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false */
package Array;

import java.util.Scanner;

public class checkeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the digit: ");   
		int n=sc.nextInt();  
	 
		System.out.println("check whether every digit of given integer is odd or even");
		System.out.println("The every digit of given integer is either even or odd:  "+test(n));
	}	
	public static boolean test(int n) {
		final int f=10;

		while(n!=0) {
			if((n%f)%2!=0){
				System.out.println("The every digit is not even");
			}
			n/=10;
		}		//it will print if false if any of them becomes different
		while(n!=0) {
			if((n%f)%2==0) {
				System.out.println("The every digit is not odd");
			}		
			n/=10;
		}
		return true;		//if all digit is odd or even then it will return true
	}
	

}
