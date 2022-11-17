/* Write a Java program to insert the specified element at the front of a linked list */

package Collections;


import java.util.LinkedList;

public class Arrayinsertfront {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.add(5);
		l1.add(10);
		l1.add(6);
		System.out.println("the list is " +l1);
		
		//insertion at the front
		l1.addFirst(100);
		System.out.println("after the insertion " +l1);
		
		

	}

}
