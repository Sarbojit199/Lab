/*Write a program to create custom exception in java. */
package com.cognizant.tax;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);		//calling constructor of the parent exception
	}
}
public class CustomException {

		static void validate(int age) throws InvalidAgeException{
			//method to check age
			if(age<18) {
				throw new InvalidAgeException("age not valid");		//throw an object of user defined
			}
			else {
				System.out.println("welcome to vote");
			}
		}

		public static void main(String[] args) {
			try {
				validate(32); //calling method
			}
			catch(InvalidAgeException ex) {
				System.out.println(ex.getMessage());		//
				
			}
	}

}
