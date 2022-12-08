/* Write a Java program to insert the specified element at the front of a linked list */

package Collections;


import java.util.LinkedList;

public class Arrayinsertfront {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		//adding into the linked list
		l1.add(5);
		l1.add(10);
		l1.add(6);
		//before insertion the list is
		System.out.println("the list is before insertion" +l1);
		
		//insertion at the front
		l1.addFirst(100);
		System.out.println("after the insertion " +l1);
		
		

	}

}
