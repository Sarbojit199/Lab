/* WAJP to store text file content into an array */

package lab10nov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArrayStore {

	public static void main(String[] args) throws Exception{				//main method with exception
		ArrayList<String> arrList= new ArrayList<>();					//arraylist created we will store
		BufferedReader bufferReader= new BufferedReader(new FileReader("C:\\Users\\punor\\abcde.txt"));		
		String curr;													//string variable where we check every line 
		while((curr=bufferReader.readLine())!=null)						 //condition to read
				arrList.add(curr);											//curr we r adding into arrlist
		bufferReader.close();												//closing
		System.out.println(arrList);										//output 
	}

}
