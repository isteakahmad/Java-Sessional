class LibraryBook {
    String title;
    String author;
    String bookID;

    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    void displayBookInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Book ID: " + bookID);
    }
}

public class Main {
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", "B08");
        LibraryBook book2 = new LibraryBook("Data Structures", "Mark Weiss", "B09");

        System.out.println("Book 1 Information ");
        book1.displayBookInfo();

        System.out.println("Book 2 Information ");
        book2.displayBookInfo();
    }
}


