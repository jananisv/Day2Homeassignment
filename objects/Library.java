package day2.homeassgn.methods.objects;

public class Library {

	public String addBook(String bookTitle) {
		
		System.out.println("Book Added Sucessfully");
		
		return bookTitle;
		
	}
	    // Method to issue a book
	    public void issueBook() {
	    	
	        System.out.println("Book issued successfully.");
	        
	    }
	    public static void main(String[] args) {
	        Library myLibrary = new Library();
	        
	        // Calling issueBook method
	        
	        myLibrary.issueBook();
	        
	        Library myBook = new Library();
	        
	        // Calling addBook and capturing the returned value
	        
	        String addedBook = myBook.addBook("Ponniyin Selvan");
	        
	        System.out.println("Added Book: " + addedBook);
	    }

}
