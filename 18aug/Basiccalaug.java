/*Write a Java program that accepts two integers from the user and then 
prints the sum, the difference, the product, the average, the distance (the 
difference between integer), the maximum (the larger of the two integers), the 
minimum (smaller of the two integers)*/

import java.util.Scanner;
public class Basiccalaug {
	public static void main(String[] args) {
		System.out.println("Welcome to coding world with Sarbojit");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:  ");     //taking user input
		int a = sc.nextInt();                          // user input initializing in variables a
		
		System.out.print("Enter second number:  ");   //taking user input
		int b= sc.nextInt();							//user input initializing in variables b
		
		
		System.out.println("Sum of two integers:"  +(a+b));			//sum =20   addition of two number
		System.out.println("Difference of two integers:" +(b-a) );  //difference=20     subtraction of numbers
		System.out.println("Product of two integers:" +(a*b) );      // product=125   multiplication of numbers
		System.out.println("Average of two integers:" +((a+b)/2));   // average=15   average of numbers
		System.out.println("Distance of two integers:" +(b-a) );     //difference=20     distance of two numbers
		
		int c = Math.max( a, b);										//maximum =25 maximum of two numbers
		System.out.println("Maximum of two integers:" +c);
		
		int d = Math.min(a, b);
		System.out.println("Minimum of two integers:" +d);            //minimum =5    mininum of two numbers
		
		
		
		
		
		

	}
} 
