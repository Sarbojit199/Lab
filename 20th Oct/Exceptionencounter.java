/*You are given a piece of Java code. You have to complete the code by writing down the handlers 
for exceptions thrown by the code. The exceptions the code may throw along with the handler 
message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable: Print "Format mismatch".
Accessing an invalid index in string: Print "Index is invalid".
Accessing an invalid index in array: Print "Array index is invalid */

package com.cognizant.tax;

import java.util.Scanner;
import java.lang.Exception;
class MyException extends Exception{		//creating my exception class
	private int detail;
	MyException(int a){			//constructor
		detail =a;
		
	}
	public String toString() {
		return "MyException["+detail+"]";
	}
}
public class Exceptionencounter {
			
	static void solve(int arr[]) throws Exception{
		int ans=0;
		for(int i=0;i<10;i++)
			for(int j=i+1;j<10;j++)
				ans+=arr[i]/arr[j];
		throw new MyException(ans);
	}
	public static void main(String[] args) throws Exception {
		try {
			Scanner in=new Scanner(System.in);
			System.out.println("enter sixe");
			int n=in.nextInt();
			int []arr= new int[n];
	
		System.out.println("enter elements");
			for(int i=0;i<10;i++)
				arr[i]=Integer.parseInt(in.nextLine());
			
			String s =in.nextLine();
			System.out.println(s.charAt(10));
			
		solve(arr);}
		
					catch(ArrayIndexOutOfBoundsException e) {	//by catch we can handle all exception if user enter invalid aray index
			System.out.println("Array index is invalid");
		}
			catch(NumberFormatException e) {		//handle number format exception
				System.out.println("format mismatch");
			}
		catch(StringIndexOutOfBoundsException e) {			//handle if user enter invalid string index
			System.out.println("index invalid");
		}
		catch(ArithmeticException e) {		//if user enter invalid division by 0
			System.out.println("invalid division");
		}
		catch(MyException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("exception encountered");
		}
finally {
	System.out.println("exception handeling completed");
}
	}

}
