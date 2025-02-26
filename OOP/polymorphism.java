public class polymorphism {
    public abstract static class Asset {
        protected String title;
        protected boolean isRented;

        public Asset(String title, boolean isRented) {
            this.title = title;
            this.isRented = isRented;
        }

        public Asset(String title) {
        	// Set default value for isRented
            this(title, false);
        }
        
        public boolean isRented() {
        	return isRented;
        }
    }
    
    public static class Book extends Asset {
        private String author;
        private int pages;

        public Book(String title, String author, int pages, boolean isRented) {
        	// Use superclass constructor with isRented
            super(title, isRented);
            this.author = author;
            this.pages = pages;
        }
        
        public Book(String title, String author, int pages) {
            this(title, author, pages, false);
        }
    }

    public static void main(String[] args) {
        Asset mobyDick = new Book("Moby-Dick", "Herman Melville", 635);
        System.out.println(mobyDick.isRented()); // false
        Asset mobyDickRented = new Book("Moby-Dick", "Herman Melville", 635, true);
        System.out.println(mobyDickRented.isRented()); // true
    }
}