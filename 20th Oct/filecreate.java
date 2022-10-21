/*Wite a program in Java to create a file in Java using Exception Handling */

package com.cognizant.tax;
import java.io.File;
import java.io.IOException;
public class filecreate {

	public static void main(String[] args) {
File myFile = new File("newfile");		// initialize file object and give a path it will create the new file in
try {
	myFile.createNewFile();			//it will create a new file
	System.out.println("file has been created" +myFile.getCanonicalPath());	//return the pathname where file is stored
}catch(IOException e){
	System.out.println("unable to create file");
	e.printStackTrace();
	
}

	}

}
