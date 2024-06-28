package assignment_week1;

public class Library {
	 
	    public String addBook(String bookTitle) {
	        System.out.println("Book added successfully");
	        return bookTitle;
	    }

	    
	    public void issueBook() {
	        System.out.println("Book issued successfully");
	    }

	    
	    public static void main(String[] args) {
	        
	        Library library = new Library();

	       
	        String bookTitle = library.addBook("The Great Gatsby");
	        System.out.println("Added Book Title: " + bookTitle);

	       
	        library.issueBook();
	    }
}