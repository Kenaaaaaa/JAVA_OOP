package example.Library;

public abstract class LibraryItem {
    private String title;
    private int id;

    public LibraryItem() {}

    public LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void displayDetails();
}