package LibraryManagementSystem;

public class RegularMember extends Member{

    @Override
    void borrowBook() throws BookNotAvailableError,BookNotAvailableError{
        super.borrowBook();
    }

    @Override
    void returnBook() {
        super.returnBook();
    }
}

