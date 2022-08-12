/*Write a Java program to compute the specified expression and print the output:
Specified Expression:(25.5*3.5-3.5*3.5)/(40.5-4.5)*/



class Expression{
public static void main(String[] args){
	double a = 25.5;                            //initializing values
	double b = 3.5;                             //      "
	double c =40.5;                             //      "
	double d = 4.5;                             //      "

	double compute = (a*b-b*b)/(c-d);           //logic for calculation
	System.out.println("The Expression is: (25.5*3.5-3.5*3.5)/(40.5-4.5");
	System.out.println("The output of the specified expression is:" +compute);
}
}