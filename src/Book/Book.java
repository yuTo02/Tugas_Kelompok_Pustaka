package Book;

public class Book {
    //inisialization methods
    private String BookTitle;
    private String BookAuthor;
    private int YearPublished;

    //constructor
    public Book (String BookTitle, String BookAuthor, int YearPublished){
        this.BookTitle = BookTitle;
        this.BookAuthor = BookAuthor;
        this.YearPublished = YearPublished;
    }

    //all method getter
    public String getBookTitle(){
        return BookTitle;
    }
    public String getBookAuthor(){
        return BookAuthor;
    }
    public int getYearPublished(){
        return YearPublished;
    }

    //all method setter
    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;
    }
    public void setBookAuthor(String BookAuthor){
        this.BookAuthor = BookAuthor;
    }
    public void setYearPublished(int YearPublished){
        this.YearPublished = YearPublished;
    }

    public void TampilkanInfo(){
        System.out.println("Book Title :" + BookTitle);
        System.out.println("Book Author :" + BookAuthor);
        System.out.println("Year published :" + YearPublished);
    }
}
