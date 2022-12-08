package classandobj;

public class Book {
	
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	// Declaring parameterized constructor for all the variables 
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	// getters and setters for allthe variables like price, category, author, title,bookid
	public String getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}

//validation for category whether it should be sci, fiction etc..
		public boolean validation() throws Exception {
			if(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others" && price > 0 &&
					bookId.startsWith("B") && bookId.length() <= 4) {
				return true;
			} else {
				//If wrong then invalid exception
				throw new InvalidBookException("Invalid ");
			}
			
		}
	}
	
	class InvalidBookException extends Exception {
		public InvalidBookException(String s) {
			super(s);
		}
	}

	
