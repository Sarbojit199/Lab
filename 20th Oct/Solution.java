/*Create a class MyCalculator which consists of a single method long power(int, int). 
This method takes two integers, n and p, as parameters and finds n^p . If either n or 
p is negative, then the method must throw an exception which says "n or p should 
not be negative.". Also, if both n and p are zero, then the method must throw an 
exception which says "n and p should not be zero." */

package com.cognizant.tax;

import java.util.Scanner;

class MyCalculator{
	/* created a method pow(int n,int p) here */
	public int power(int n,int p) throws Exception{
		if(n==0 || p==0) throw new Exception(" n and p should not be zero");
		else if(n<0 || p<0) throw new Exception("n and p should not be negative");
		else return (int)(Math.pow(n, p));
	}
}
public class Solution {

	public static void main(String[] args) {
		 MyCalculator mcalc=new MyCalculator();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two integer");
		int n= s.nextInt();
		int p=s.nextInt();
		try {
			System.out.println(mcalc.power(n, p));
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
