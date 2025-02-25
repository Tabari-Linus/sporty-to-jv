public class Main {
    public static class Book {
        private int pages;
        private String author;
        private String title;
        private boolean isRented;
        
        // Set the access modifier for the constructor
        public Book(String title, String author, int pages) {
        	this.pages = pages;
            this.author = author;
            this.title = title;
            this.isRented = false;
        }
        
        // Set the access modifier for the methods
        public void printDetails() {
        	System.out.println(prepareDetails());
        }
        
        private String prepareDetails() {
            return "Book{title='" + title + "', isRented=" + isRented + ", author='" + author + "', pages=" + pages +  "}";
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Moby-Dick", "Herman Melville", 635);
        book.printDetails();
    }
}

// Use protect if you want it to be available in sub class , private for only that class