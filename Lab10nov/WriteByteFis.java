
/*Write a Java program to read first 3 lines from a file */

package lab10nov;

import java.io.FileInputStream;

public class WriteByteFis {

	public static void main(String[] args) {
		try {
			FileInputStream f= new FileInputStream("C:\\\\Users\\\\punor\\\\abcde.txt");			//path of the file
			int i=0;
			while((i=f.read())!=-1) {				//read every words untill it becomes false
			System.out.print((char)i);					//print the char
			}											//writing the file 
			f.close();									//closing the f
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}

	}

}
