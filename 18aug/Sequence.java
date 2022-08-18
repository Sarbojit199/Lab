/*Write a Java program to break an integer into a sequence of individual 
digits.
Sample Input – 123456
Sample output – 1 2 3 4 5 6 */

package Java;

public class Sequence {
	public static void main(String[] args) {
		System.out.println("Welcome to coding world with Sarbojit");
		
		int [] arr = {1,2,3,4,5,6};               // taking an array type input and initializing array values
		 
		for(int i=0; i<arr.length; i++) {      //iterating through array   till the end of the array
			System.out.print(arr[i]+" ");      // printing the array and keep the spacing between them
		}
	}
}
