package BookType;
import Book.Book;

public class NonFictionBook extends Book {
    private String Genre;
    private double Rating;

    public NonFictionBook(String BookTitle, String BookAuthor, int YearPublished, String Genre, double Rating){
        super(BookTitle, BookAuthor, YearPublished);
        this.Genre = Genre;
        this.Rating = Rating;
    }

    //All methods getter
    public String getGenre(){
        return Genre;
    }
    public double getRating(){
        return Rating;
    }
    //All methods setter
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    public void setRating(double Rating){
        this.Rating = Rating;
    }

    //method override
    @Override
    public void TampilkanInfo(){
        super.TampilkanInfo();
        System.out.println("Genre Book : " + Genre);
        System.out.println("Rating Book : " + Rating);
    }
    
}
