package javak;

import java.util.Scanner;

class summing{
	public static int addTwoPossitive(int n,int p)  throws Exception{			//method for adding
		if(n<0 && p<0) throw new Exception("negative values sent");			//if sent values is negative
		else return (int)(n+p);												//if both values are possitive
	}
	
}
public class sumexception {
	
	public static void main(String args[]) {
	 summing obj= new summing();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two integer");
		int n= s.nextInt();													//input both numbers
		int p=s.nextInt();
		try {																//try to catch run
			System.out.println("sum of two integer is  " +summing.addTwoPossitive(n, p));
			
		}						
		catch(Exception e) {												//if not run then shows exception
			System.out.println(e);
		}
		finally {
			System.out.println("end of the program and finally block executed");
		}
	}
	}


