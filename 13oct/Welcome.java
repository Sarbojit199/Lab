/*
 * Write a program which creates a String “Welcome to Java World” and performs the following 
•	Returns the character at 5th position and display it.
•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
•	Concatenates “- Let us learn” to the above string and display it.
•	Returns the position of the first occurrence of character ‘a’ and display it.
•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
•	Returns string between 4th position and 10th position and display it.
•	Returns the lowercase of the string and display it.

Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 
1.	Adds the string ”- This is a sample program” to existing string and display it.
2.	Inserts the string “Object” into the existing string at 21st postion and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

 */

package String;

import java.util.StringTokenizer;

public class Welcome {

	public static void main(String[] args) {
		String s1="Welcome to Java World";
		System.out.println(s1.charAt(4));			//char at that index
		
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		String s2="Let us learn";
		String concat=s1+s2;
		System.out.println(concat);		//join s1 and  s2
		
		System.out.println(s1.indexOf("a"));			// a is in 12th index
		String replace=concat.replace("a", "e");
		System.out.println(replace);		//print the replace with a with e
		String trim=concat.substring(4, 10);		///trim the string
		System.out.println(trim);
		String lower=concat.toLowerCase();
		System.out.println(lower);
		
		//Problem statement 2
		String s3="This is StringBuffer";
		String s4="This is a simple program";
		String concatt=s3+s4;
		System.out.println(concatt);
		
		for(int i=concat.length()-1;i>=0;i--) {		//reverse
			System.out.print(concat.charAt(i));}
			System.out.println("");
			
		
		String s5=s3.replace("Buffer", "builder");	//replace
		System.out.println(s5); //This is Stringbuilder

		StringTokenizer st=new StringTokenizer("C:\\IBM||DB2||PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive:" +st.nextToken("\\"));
		System.out.println("Folders:" +st.nextToken("\\"));
		System.out.println("File:" +st.nextToken("\\"));

	}

}
