package example.Library;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    public Book() {
        super();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("ID: " + super.getId());
        System.out.println("Author: " + author);
    }
}
