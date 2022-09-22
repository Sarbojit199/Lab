/*1.write a java program to print sum of odd numbers up to N */
package demo;

import java.util.Scanner;

public class oddnumsum {
	public static void main(String[] args) {
	int size; int sum=0;		//initializing and declaring variables
	Scanner s=new Scanner(System.in);
	

	System.out.println("Enter any number");
	size= s.nextInt(); s.close();
	
	for(int i=0;i<=size;i++) {		//sum of all the values 
		if(i%2!=0) {
		sum=sum+i;
		
		}}
		System.out.println(" The sum of odd number of the array is =" +sum);
	
	}}
	
