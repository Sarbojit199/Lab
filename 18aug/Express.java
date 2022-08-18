/*Write a Java program to find the value of specified expression. 
a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)*/

package Java;
public class Express {
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the coding world with Sarbojit");
		System.out.println((101+0)/3);    
		System.out.println(3.0e-6 * 10000000.1);
		System.out.println(true && true);				//true    in && operator if both input true then output true
		System.out.println(false && true);				//false   in && operator if any input false then output false
		System.out.println((false&& false) || (true && true));    //(false  || true) = true  in or operator if any input true then output true
		System.out.println( (false || false) && (true && true));  ///(false && true) = false  in and operator if any input false then output false
	}
	

}
