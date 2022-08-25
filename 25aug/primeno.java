//WAJP take number from user and check whether a number is prime or not
package Java;
import java.util.Scanner;
public class primeno {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number  ");
			int a=sc.nextInt();
			int flag=0;				//initializing variable as flag it will become 1  if number become 1
			if(a==0 ||a==1)		flag=1;
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					 flag=1;			//if number is prime flag 1 
					break;
				}
			}
			if(flag==0) {		//if number  prime flag will remain  0 and wont change
			System.out.println("The number is a prime");
			}
			else {
				System.out.println("The number is not prime");
			}
		}
}
