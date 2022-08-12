/*Write a Java programe that takes five number as a input to calculate 
and print the average of the five numbers*/

class Average{
	public static void main(String[] args){
	System.out.println("The five numbers are");       
	int a=10;                                      
	int b=20;
	int c=30;
	int d=40;
	int e=50;
	System.out.println("The first number is:" +a);
	System.out.println("The second number is:" +b);
	System.out.println("The third number is:" +c);
	System.out.println("The fourth number is:" +d);
	System.out.println("The fifth number is:" +e);
	
	int average= (a+b+c+d+e)/5;
	System.out.println("The average is:"  +average);
}
}