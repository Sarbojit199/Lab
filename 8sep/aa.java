/*Q.2... Write a java class to develop an employee class object using 
constructor.
The constructor hold initialized the emp name & emp Id for 5 Emp
now write another class having name and from this class you have to 
create 5 employee objects but 
you are not allowed to use new keyword.*/

package com.innovation.shapes;
 class A{
	
	 static void sete(int id, String name) {		
		 System.out.println("The id of the emp is:  " +id+  "   and name is  " +name);
		 
}
}
public class aa {
	public static void main(String[] args) {
		A.sete(23, "Sarbojit");		//calling without creating new keyword
		A.sete(24, "Rohan");
		A.sete(21, "ABC");
		A.sete(22, "CDF");
		A.sete(25, "XYZ");
	}
}
