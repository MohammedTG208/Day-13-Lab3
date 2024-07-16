import java.util.ArrayList;

public class Store {
  private  ArrayList<User>users=new ArrayList<>();
  private ArrayList<Media>media=new ArrayList<>();

    public Store(ArrayList<User> users, ArrayList<Media> media) {
        this.users = users;
        this.media = media;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public ArrayList<User> displayUser(){
        return this.users;
    }
    public void addMedia(Media media){
        this.media.add(media);
    }
    public ArrayList<Media> displayMedia(){
        return this.media;
    }
    public Book serchBook(String text){
        for (Media media1: this.media){
            if (media1 instanceof Book &&media1.getTitle().equalsIgnoreCase(text)){
                return (Book) media1;
            }
        }
        return null;
    }
}
