package LibraryManagementSystem;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private boolean availabilityStatus;

    //constructor
    public Book() {
    }



    //Methods

    void addBook(){

    }

    void removeBook(){

    }

    void searchBook(){

    }


    //Setter - Getter


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
