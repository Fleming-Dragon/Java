import java.util.ArrayList;

public class day2_9 {
    //library management system
    public static void main(String[] args) {

    }
}


class Books
{
    private final int id;
    private final String title;
    private final String author;
    private boolean isAvailable;

    Books(int id , String title , String author)
    {
        this.id = id;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void getDetails()
    {
        System.out.println("Id : "+id+"Title : "+title+"Author : "+author+"Availability : "+(isAvailable?"Yes":"No"));
    }
}

class Member
{
    private String Name;
    private int id;
    private ArrayList<Books> borrowedBooks;

    public Member(String name , int id )
    {
        this.borrowedBooks = new ArrayList<>();
        this.id = id;
        this.Name = name;
    }

    public void borrowedBook(Books book)
    {
        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println(this.Name + "borrowed" + book.getTitle());
    }

    public void returnBook(Books book)
    {
        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println(this.Name + "returned" + book.getTitle());
    }

}

class Library
{
    private ArrayList<Books> books;
    private ArrayList<Member> members;

    Library()
    {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook()
    {

    }

}