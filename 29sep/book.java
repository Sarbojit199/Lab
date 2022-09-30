/*Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variable */
package Array;

import java.util.Scanner;



class library{
	int bookid;
	String bookName;
	String bookAuthor;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
}
public class book {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bId;
		String b_Name;
		String b_Author;
			
	
		library obj=new library();
		//creating object and sending values
		
		obj.setBookid(200);
		obj.setBookName("power of freedom");
		obj.setBookAuthor("nikola rose");
		
		System.out.println("The book id is : "+obj.bookid);
		System.out.println("The book name is " +obj.bookName);
		System.out.println("The book author is" +obj.bookAuthor);
		

	}

}
