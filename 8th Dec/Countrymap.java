/* 1.	Develop a java class with a instance variable CountryMap  HashMap (M1)  add a method storeCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country	Value - Capital
India	Delhi
Japan	Tokyo

2.	Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
3.	Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4.	Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
 */

package Collecti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class map{
	HashMap<String,String> mp = new HashMap<>();
	//adding into map1
	public void addCountry(String country,String capital) {		//to add the country and capital into the hashmap
		mp.put(country,capital);
	}
	public void retrieve() {				//to retreive the data from the hashmap
		Iterator<String> itr= mp.keySet().iterator();
		System.out.println("From map1");
		while(itr.hasNext()) {
			String key= itr.next();						//iterator
			System.out.println(key+" -> "+mp.get(key));		//print the country->capital 
	}}
		//storing into map2 from map1
		public void storeInMap2() {
			HashMap<String,String> mp1 = new HashMap<>();
			Iterator<String> itr1= mp.keySet().iterator();
			while(itr1.hasNext()) {
				String key= itr1.next();						//iterator
				String value= mp.get(key);
				mp1.put(value, key);
				//retreiving map2
			}
				System.out.println("From map 2 ");
				Iterator<String> itr2= mp1.keySet().iterator();
				while(itr2.hasNext()) {
					String capital =itr2.next();
					System.out.println(capital+"-> "+mp1.get(capital));
				}}
		//storing country into array from map 
	public void storeIntoArray() {
		ArrayList<String> a1=new ArrayList<>();
		Iterator<String> itr= mp.keySet().iterator();
		System.out.println("after storing into array the country");
		while(itr.hasNext()) {
			String key= itr.next();	
			a1.add(key);}
			System.out.println(a1);
		}	}
public class Countrymap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		map Map=new map();
		System.out.println("Enter the number of countries you want to add");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
		System.out.println("enter the country");
		String country= sc.next();
		System.out.println("enter the capital");
		String capital= sc.next();
		Map.addCountry(country, capital);
		}
		Map.retrieve();
		Map.storeInMap2();
		Map.storeIntoArray();
		
	}
	

}
	


