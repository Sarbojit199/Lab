/*you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. And then read the updated value. 
Sample Output: Area = 800
New area = 900  */


package com.cognizant.shapes;
import java.util.Scanner;

class Rectangle{
	 
		private int length;
		private int breadth;
			
		static int Rec(int l,int b) {
			int length =l;
			int breadth =b;
			return length*breadth;			//private instandce variables is visible in its class
		}
		
}

public class RectangleTest {
	public static void main(String[] args) {
	Rectangle obj = new Rectangle();
	Scanner Sc =new Scanner(System.in);
	System.out.print("Enter the first integer   ");
	int num1 =Sc.nextInt();
	System.out.print("Enter the second integer   ");
	int num2 =Sc.nextInt();
	
	System.out.println(obj.Rec(num1,num2));
	System.out.print("Enter the new integer1    ");
	int new1 =Sc.nextInt();
	System.out.print("Enter the new integer2   ");
	int new2 =Sc.nextInt();
	System.out.println(obj.Rec(new1,new2));
	
	
	
		
	
	}
}
