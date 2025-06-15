package example.Library;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("1984", 1, "George Orwell");
        LibraryItem magazine = new Magazine("National Geographic", 2, 2023);
        Member member = new Member("Alice", 101);
        member.borrowItem(book);
        member.displayBorrowedItems();

    }
}
