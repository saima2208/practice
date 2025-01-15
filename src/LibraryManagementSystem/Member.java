package LibraryManagementSystem;

import java.util.ArrayList;

public class Member {
        private String name;
        private String memberShipType;
       ArrayList<String> borrowedBook = new ArrayList<>();

    public Member() {
    }

    public Member(String name, String memberShipType) {
        this.name = name;
        this.memberShipType = memberShipType;
    }

    public Member(ArrayList<String> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    void borrowBook(){

    }

    void returnBook(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberShipType() {
        return memberShipType;
    }

    public void setMemberShipType(String memberShipType) {
        this.memberShipType = memberShipType;
    }
}
