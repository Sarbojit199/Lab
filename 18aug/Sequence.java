/*Write a Java program to break an integer into a sequence of individual 
digits.
Sample Input – 123456
Sample output – 1 2 3 4 5 6 */

package Java;
import java.util.Scanner;
public class Sequence {
	public static void main(String[] args) {
		System.out.println("Welcome to coding world with Sarbojit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");        
		int a=sc.nextInt();							//taking input from the user
		
		
		int digit2 = a/100000%10;            //taking remainder and modulus the number 
		int digit3 = a/10000%10;
		int digit4 = a/1000%10;
		int digit5 = a/100%10;
		int digit6 = a/10%10;
		int digit7 = a%10;
		System.out.println( digit2+" "+digit3+" "+digit4+" "+digit5+" "+digit6+" "+digit7); //output 1  2  3  4  5  6 
		
		
		
		
		
		
	}
}
