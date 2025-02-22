public class Main {
    public static class Book {
        int pages;
        boolean isRented;

        void checkIfRented() {
        	// Check if the book is rented
            if (isRented) { 
            	// Print the number of pages
                System.out.println("Book with " + pages + " pages is rented!"); 
            } else {
            	// Print the number of pages
                System.out.println("Book with " + pages + " pages is available!"); 
            }
        }
    }
    
    public static void main(String[] args) {
        Book book = new Book();
        book.checkIfRented();
    }
}