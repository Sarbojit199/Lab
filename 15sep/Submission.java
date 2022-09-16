/*1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters.*/

class Arithmetic{
	static int add(int a,int b) {
		return a+b;
	}
}
class Adder extends Arithmetic{
	
}

public class Submission {
	public static void main(String[] args) {
Arithmetic obj =new Adder();
System.out.println(obj.add(2,3));
}
}
