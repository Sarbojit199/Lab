/* Write a Java program to extract a portion of an array list */

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arrayextract {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		
		all.add("Red");
		all.add("Green");
		all.add("Orange");
		all.add("white");
		all.add("Black");
		System.out.println("the list is  " +all);
		
		List<String> extract_list = all.subList(0, 3);					//it will extract the value from 0_3
		System.out.println("The extracted list is " +extract_list);
		

	}

}
