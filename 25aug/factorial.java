//WAP to find the factorial of any number form user input
package Java;
import java.util.Scanner;

public class gh {
	public static void main(String[] args) {
		int n=5; int ans=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number   ");
		int fact =sc.nextInt();
		for(int i=fact;i>0;i--) {					//starting from factorial to an d run loop till number become 1
				
			ans =ans*i;						
			}
		System.out.println(ans);
	
	
	}
	
	
}
