import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stake, ArrayList<Integer> reviews, String subject) {
        super(title, auteur, ISBN, price, stake, reviews);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return super.getAverageRating()>=4?"Bestselling AcademicBook":"AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString()+" "+" Subject "+this.subject;
    }
}
