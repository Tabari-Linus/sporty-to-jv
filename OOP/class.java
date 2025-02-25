public class Main {
    public static class Book {
        String name;
        int pages;
        // Add the author field as String
        String  author;

        Book(String name, int pages, String author) {
            this.name = name;
            this.pages = pages;
            this.author = author;
        }
    }

    public static void main(String[] args) {
        // Create the Moby Dick object with Herman Melville as author
        Book mobyDick = new Book("Moby-Dick", 635, "Herman Melville");
    }
}