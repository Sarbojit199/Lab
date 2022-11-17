/* Write a Java program to compare two array list */

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arrylistcompare {
public static void main(String[] args) {
		List<String> all = new ArrayList<String>();				//aarraylist
		all.add("you");											//adding in list
		all.add("me");
		all.add("they");
		all.add("them");
		
		
		List<String> al2 = new ArrayList<String>();					//arraylist
		al2.add("story");					
		al2.add("of");
		al2.add("my");
		al2.add("journey");
		
		System.out.println("Yes content are equal  " +(all.toString().contentEquals(al2.toString())));			//compare

		
	}

}
