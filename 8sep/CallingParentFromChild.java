
/*Q.4…. Can you create object of a class from inside the scope of 
another class constructor.*/

package com.cognizant.shapes;


 class parent{
public 	void a() {
	

			System.out.println("yes we can call this from other class");
}}
class child extends parent{
		public void method() {
			parent obj1 =new parent();
		
			//YEs we can create object of class from scope of another class
		}
}
public class CallingParentFromChild{
	public static void main(String[] args) {
	
		
	
		
	
	}
}
