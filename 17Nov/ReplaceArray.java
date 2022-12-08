/* Write a Java program to replace an element in a linked list */

package Collections;

import java.util.LinkedList;

public class ReplaceArray {
	
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();		//creating new arraylist object
		

		//adding into the linked list
		l1.add(5);				//adding the element
		l1.add(10);
		l1.add(6);
		System.out.println("before insert the list is " +l1);
		//replace any values and print
		l1.set(1, 9);   //replacing the element
		System.out.println("after inserting the list is" +l1);
		
		
		
	}

}
