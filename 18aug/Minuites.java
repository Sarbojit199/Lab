/*Write a Java program to convert minutes into a number of years and 
days.
Test Data
Input the number of minutes: 3456789 */


package Java;

public class Minuites {
			public static void main(String[] args) {
				System.out.println("Welcome to coding world with Sarbojit");
				double min = 3456789;
				double  minutesinyear = 60*24*365;
				long years = (long)(min/minutesinyear); //output=6  number of years required to achieve that minute
				
				int days = (int)(min/60/24)%365;   //output = 210  to number of dates after 6 years to reach that minuite
				System.out.println("approximatly " +years+ " years and  "+days+ " days");
			}
}
