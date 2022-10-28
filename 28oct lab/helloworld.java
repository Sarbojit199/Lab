package javak;

import java.util.Scanner;

class MyCalculator{
	/* created a method here */
	public int negative(int n,int p) throws Exception{
		if(n<0 && p<0) throw new Exception("n and p should not be negative");
		else return (int)(n*p);						//returning the multiplication
	}
}
public class helloworld {
		public static void main(String args[]) {
			MyCalculator mcalc=new MyCalculator();
			Scanner s=new Scanner(System.in);
			System.out.println("enter the two integer");		
			int n= s.nextInt();						 //enter first integer
			int p=s.nextInt();						//enter second integer
			try {
				System.out.println(mcalc.negative(n, p));			//calling method
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
}
