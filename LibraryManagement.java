package assignment_week1;

public class LibraryManagement {

	public static void main(String[] args) {
        
        Library library = new Library();

      
        String bookTitle = library.addBook("To Kill a Mockingbird");
        System.out.println("Added Book Title: " + bookTitle);

     
        library.issueBook();
    }
}
