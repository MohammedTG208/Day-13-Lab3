import java.util.ArrayList;

public class Book extends Media{
   private int stake;
   private ArrayList<Integer> reviews;
    public Book(String title, String auteur, String ISBN, double price,int stake,ArrayList<Integer> reviews) {
        super(title, auteur, ISBN, price);
        this.stake=stake;
        this.reviews=reviews;
    }
//    addReview(Review review): Adds a review to the book's list
    public void addReview(Review reviews){
        this.reviews.add(reviews.getRating());
    }

    //    getAverageRating(): Calculates and returns the average rating.
    public int getAverageRating(){
        int average=0;
        for (Integer review : this.reviews) {
            average += review;
        }
        return average/reviews.size();
    }
//    purchase(User user): Allows users to add the book to the purchased list
public void purchase(User user){
    if (this.getStake() > 0) {
        user.addToCart(this);
        this.setStake(this.getStake() - 1);
        System.out.println("added to cart.");
    } else {
        System.out.println("Sorry is out of stock.");
    }
}
//    isBestseller(): This method checks if a book is a bestseller based on
//criteria such as if its average rating more than or equal 4.5.
    public Boolean isBestseller(){
        return getAverageRating() >= 4;
    }

// restock(int quantity): This method allows for restocking a book by
//increasing its quantity in stock. It also prints a message to inform about the
//restocking.
    public void restock(int quantity){
        this.stake=quantity;
        if (this.stake<2){
            System.out.println("restocking");
        }
    }
//    getMediaType(): return "Bestselling Book" if Average Rating
//more than or equel 4.5, else return "Book"
    @Override
    public String getMediaType() {
        if (isBestseller()){
            return "Bestselling Book";
        }else {
            return "Book";
        }
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ "Stake: "+ this.stake+" reviews "+ this.reviews;
    }
}
