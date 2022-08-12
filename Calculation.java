/*write a java program to print the addition, subtraction, division,
 multiplication, remainder*/


class Calculation{
	public static void main(String[] args){
	System.out.println("enter two numbers:");
	int a=10;                                                //initialize  variable
	int b=5;                                                 // initialize variable
	System.out.println(a +" "+ b);
	int sum = a+b;                                           //logic for addition of both numbers
	
	System.out.println("The sum of two numbers is:=" +sum);


	int sub = a-b;                                           //logic for subtraction of both numbers
	System.out.println("The subtraction of two number is:=" +sub);
	
	int multiplication = a*b;                                // logic for multiplication of both number
	System.out.println("The multiplication of two number is:=" +multiplication);

	int division = a/b;                                      // logic for division of both number
	System.out.println("The division of two number is:=" +division);
	
	int remainder = a%b;                                    // logic for the remainder
	System.out.println("The remainder of the two number is:=" +remainder);
	}
}