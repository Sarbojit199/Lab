/*Write a Java program to find sequences of lowercase letters joined with a underscore.*/

package String;

public class lowercasejoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validate("java_exercises")); // if two word join with underscore and lowercase

	}

	public static String validate(String text) {
		if (text.matches("^[a-z]+_[a-z]+$")) {
			return "found a match";
		} else {
			return "not found a match";
		}
	}
}
