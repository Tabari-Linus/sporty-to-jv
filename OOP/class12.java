public class Main {

    public static class Book {
    	int pages;
        String author;
        String title;
        boolean isRented;

        public Book(String title, String author, int pages) {
            // Initialize all fields using the arguments as values
            this.title = title;
            this.author = author;
            this.pages = pages;
            // Initialize isRented field as false
            this.isRented = false;
        }
        
        // Complete method with name `checkIfRented` and without returning value
        void checkIfRented() {
            if (isRented) {
                System.out.println("Book is rented!");
            } else {
                System.out.println("Book is available!");
            }
        }
    }

    public static void main(String[] args) {
        // Create a new instance of a book with the given attributes
        Book book = new Book("Moby-Dick", "Herman Melville", 635);
        System.out.println("Book{title='" + book.title + ", author='" + book.author + "', pages=" + book.pages +  "}");
        book.checkIfRented();
    }
}