/* Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, where N is a integer which is passed as a parameter to the 
method storeEvenNumbers(). The method should return the ArrayList (A1) created. 
2. In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method 
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it 
should return the Number else return zero */

package Collections;

import java.util.ArrayList;
public class storeeven {
		ArrayList<Integer> list1 = new ArrayList<Integer>();		//creating array list of type integer
		public ArrayList<Integer> saveEvenNumber(int N){			//methods to print even number
			for(int i=0;i<=N;i++) {									//for loop to iterate
				if(i%2==0) list1.add(i);							//adding in the list
			}
			return list1;									//return the list
		}
		ArrayList<Integer> newlist = new ArrayList <Integer>();
		 public ArrayList<Integer> printeven(){					//method to print new list 
			 for(int item: list1) {								//traversing the list
				 newlist.add(item*2);							//adding the new list
				 System.out.print(+item*2);
				 }
			 return newlist;
		 }
		 public void retrivevalue(int find) {
			 if(newlist.contains(find)) {					//check if the new list contains the element
					System.out.print("element is present in the arraylist");
				 }
				 
			 }
			 public static void main(String[] args) {
				 storeeven obj = new storeeven();
				 obj.saveEvenNumber(10);						
				 obj.printeven();
				 System.out.println();
				 obj.retrivevalue(4);
			 }
		
		
		

	}


