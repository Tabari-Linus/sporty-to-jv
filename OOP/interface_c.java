public class interface_c{

    public interface Rentable {
        void rent();
    }
	// Implement the Rentable interface
    public abstract static class Asset implements Rentable {
        protected String title;
        protected boolean isRented;
        public Asset(String title) {
            this.title = title;
            this.isRented = false;
        }
        @Override
        public void rent() {
            if (!isRented) {
                isRented = true;
                System.out.println(title + " has been rented.");
            } else {
                System.out.println(title + " is already rented.");
            }
        }
    }

    public static class Book extends Asset {
        private String author;
        private int pages;

        public Book(String title, String author, int pages) {
        	// Initialize superclass
            super(title);
            this.author = author;
            this.pages = pages;
        }

        @Override
        public String toString() {
        	// Print the fields info
            return "Book{title='" + this.title + "', isRented=" + this.isRented + ", author='" + this.author + "', pages=" + this.pages +  "}";
        }
    }

    public static void main(String[] args) {
        Asset book = new Book("Moby-Dick", "Herman Melville", 635);
        System.out.println(book);
        book.rent();
        System.out.println(book);
    }
}