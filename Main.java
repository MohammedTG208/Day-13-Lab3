import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        2. Create instances of various books, movies, and music items, including Novel and
            //AcademicBook objects.
//        books
        ArrayList<Integer>re=new ArrayList<>();
        re.add(4);
        re.add(5);
        re.add(5);
        re.add(4);
        Book book1=new Book("Gulnar Onay","Gulnar Onay","1243221",29.50,6,re);
//       movies
        Movie movie1=new Movie("Hary boater","J.K. Rowling","8735256",15,110);
        Movie movie2=new Movie("Oppenheimer","Christopher Nolan","87353256",22,220);
        Movie movie3=new Movie("The Dark Knight","Christopher Nolan","736526",32.32,120);
//        music
        Music music1=new Music("Good morning","Kanye Wes","3245432",3.50,"Kanye West");
//       Novel
        ArrayList<Integer>rating=new ArrayList<>();
        rating.add(3);
        Novel novel1 =new Novel("Game of Thrones","George Raymond Richard Martin","23212",200,25,rating,"Action");
//       AcademicBook
        ArrayList<Integer> reiewAcademicBook=new ArrayList<>();
        reiewAcademicBook.add(2);
        reiewAcademicBook.add(1);
        AcademicBook academicBook=new AcademicBook("Working Effectively with Legacy Code","Michael C. Feathers","232133",99,10,reiewAcademicBook,"How to write code");
        System.out.println(academicBook.getMediaType());
        System.out.println("AverageRating: "+academicBook.getAverageRating());

//        Add media items to the store's available media list.
        Media media1=new Media("Good Morning","Nacio Herb Brown","3245432",3.5);
        Media media2 = new Media("The Great Gatsby", "F. Scott Fitzgerald", "212342", 10.99);
        Media media3 = new Media("Mona Lisa", "Leonardo da Vinci", "735525267", 25.00);
        ArrayList<Media> arrMedia=new ArrayList<>();
        arrMedia.add(media1);
        ArrayList<Media>arrUser=new ArrayList<>();
//        arrUser.add(book1);
        arrMedia.add(book1);
        arrMedia.add(movie3);
        arrMedia.add(movie2);
        arrMedia.add(movie1);
        User user1=new User("Mohammed","Mohammed@gmail.com",arrUser,arrMedia);
//        Allow users to add items to their shopping carts, remove items, and complete purchases.
        user1.addToCart(music1);
        book1.purchase(user1);
        System.out.println(book1.getStake());
        System.out.println(user1.getPurchasedMediaList());
        System.out.println(user1.getShppingCart());
        user1.removeFromCart(book1);
        System.out.println(user1.getShppingCart());
        user1.checkOut(music1);
        System.out.println(user1.getShppingCart());

//        Allow users to leave reviews for books and calculate the average rating for each book.
        Review review1=new Review(user1.getUserName(),5,"its good");
        book1.addReview(review1);
        System.out.println(book1);
        System.out.println("Average Rating "+book1.getAverageRating());

//        Test different scenarios to ensure the functionality of your Online Media Store.
        music1.listen(user1);
        Review review2=new Review(user1.getUserName(), 5,"the best");
        novel1.addReview(review2);
        System.out.println(novel1.getAverageRating());
        System.out.println(novel1.getMediaType());
        user1.addToCart(novel1);
        System.out.println(user1.getShppingCart());
        System.out.println(user1.getPurchasedMediaList());
        ArrayList<User>arrUser1=new ArrayList<>();
        arrUser1.add(user1);
        ArrayList<Media>arrMedia1=new ArrayList<>();
        arrMedia1.add(novel1);
        arrMedia1.add(book1);
        academicBook.purchase(user1);
        arrMedia1.add(academicBook);
        Store store1=new Store(arrUser1,arrMedia1);
        System.out.println(store1.displayMedia());
        ArrayList<Movie>arrMovie=new ArrayList<>();
        arrMovie.add(movie3);
        arrMedia.add(movie1);
        System.out.println(movie2.recommendSimilarMovies(arrMovie));


    }
}