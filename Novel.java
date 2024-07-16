import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stake, ArrayList<Integer> reviews, String genre) {
        super(title, auteur, ISBN, price, stake, reviews);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return super.getAverageRating()>=4?"Bestselling Novel":"Novel";
    }

    @Override
    public String toString() {
        return super.toString()+" genre "+this.genre;
    }

}
