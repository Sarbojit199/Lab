
/*Given an Advancedarithmetic class and another class Mycalculator which implement the meathod  
 * we have to take integer as a sum from user and find all divisor and return add all divisor of that number 
 * and number should be less than equal to 1000
 input =6 divisor of 6 are 1+2+3+6=12 */
 

import java.util.Scanner;
class MyCalculator{
static int divisrSum(int num) {
	 int result = 0;
     	for (int i = 2; i <= Math.sqrt(num); i++){			// find all divisors except one which divides 'num' till sqrt
     			if (num % i == 0) {							//// if 'i' is divisor of 'num'
     				if (i == (num / i))						// if both divisors are same then add it only once else add both
                 	result += i;
             else
                 result += (i + num / i);				//adding all divisor 
         }
     }
     	return (result + 1+num);					//at last add 1 to last
 }
}
public class AdvancedArithmetic {
public static void main(String[] args) {
	MyCalculator obj = new MyCalculator();
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number:   ");
	int num =sc.nextInt();
	if(num<=1000) {
	System.out.println(obj.divisrSum(num));
	}
	else{
		System.out.println("you have entered more than 1000 so it is outside our condition ");
	}
	}
}
	

