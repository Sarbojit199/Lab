/* 1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
*/

package Collecti;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class add{
	 HashSet<String> hs = new HashSet<>();
	 public void addCountry(String c) {
		 hs.add(c);
		 }
public void retrieve() {
	Iterator value= hs.iterator();
	System.out.println("The country you added are");
	while(value.hasNext()) {
		System.out.println(value.next());
	}}}
public class Country {
public static void main(String[] args) {
		add obj=new add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of countries you want to add");
		int n= sc.nextInt();
		System.out.println("Enter the "+n+" country  want to add:- ");
		for(int i=0; i<n; i++) {
		String c = sc.next();
		obj.addCountry(c);
		}
		obj.retrieve();
			}
			}
			
		
		
		
		
 
		
	
	

