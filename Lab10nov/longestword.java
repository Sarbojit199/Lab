/* Write a Java program to find the longest word in a text file */

package lab10nov;

import java.io.File;
import java.util.Scanner;


public class longestword {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(new File("C:\\\\Users\\\\punor\\\\abcde.txt"));			//path of file
			String longest="";										//asigning and initializing empty string
			String curr;					
			while(sc.hasNext()) {
				curr=sc.next();										//store every string in curr
				if(curr.length()>longest.length()) {				//if curr length greater than previous length
					longest=curr;									//the longest char will store it here
				}
				
			}
			System.out.print(longest);								//print the longest char
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
