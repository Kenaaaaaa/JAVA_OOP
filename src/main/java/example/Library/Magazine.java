package example.Library;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    public Magazine() {
        super();
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("ID: " + super.getId());
        System.out.println("Issue number: " + issueNumber);
    }
}