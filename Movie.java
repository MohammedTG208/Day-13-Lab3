import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
//    watch(User user): Allows users to watch the movie by adding the movie to
//the purchased list .
    public void watch(User user){
        if (user.getPurchasedMediaList().equals(super.getTitle())){
            System.out.println(user.getUserName()+" watch "+super.getTitle());
        }else {
            Media movies=new Media(super.getTitle(),super.getAuteur(),super.getISBN(),super.getPrice());
            ArrayList<Media> addmovies=new ArrayList<>();
            addmovies.add(movies);
            user.setPurchasedMediaList(addmovies);
        }
    }

//    recommendSimilarMovies(List<Movie> movieCatalog): Recommends
//similar movies based on the director (auteur).
    public ArrayList<Movie> recommendSimilarMovies (ArrayList<Movie> movieCatalog){
        ArrayList<Movie> recommdation=new ArrayList<>();
        for (Movie movie: movieCatalog){
            if (movie.getAuteur().equals(super.getAuteur())){
                recommdation.add(movie);
            }
        }
        return recommdation;
    }

//    getMediaType(): return "Long Movie" if duration more than or
//    equel 120, else return "Movie".
    @Override
    public String getMediaType() {
        return this.duration>=120?"Long Movie":"Movie";
    }

    @Override
    public String toString() {
        return super.toString()+" "+" duration:"+this.duration+" min";
    }
}
