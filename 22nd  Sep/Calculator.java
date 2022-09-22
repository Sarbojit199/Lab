/*2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.*/

package demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int x,y;		//initializing and declaring variable
	System.out.println("enter the first number");
	x=s.nextInt();		//1st number enter
	System.out.println("Enter the second number");
	y=s.nextInt();		//2nd number enter
	
	s.close();
	System.out.println("Addition is" +addition(x,y));
	System.out.println("subtraction is" +subtraction(x,y));
	System.out.println("multiplication is" +multiplication(x,y));
	
	}
	public static int addition(int x,int y) {
		return x+y;
	}
		public static int subtraction(int x,int y) {
			if(x>y) {
				return x-y;		//if 1st number is greater then 2nd then return subtract
			}
			else {
				return y-x;	//if 2ndt number is greater then 1st then return subtract
			}
		}
			public static int multiplication(int x,int y) {
				return x*y;
			}
}
