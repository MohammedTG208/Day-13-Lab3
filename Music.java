import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String title , String auteur,String ISBN,double price,String artist){
        super(title,auteur,ISBN,price);
        this.artist=artist;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }
//    generatePlaylist(List<Music> musicCatalog): Generates a playlist of
//similar songs based on the artist (auteur).
    public ArrayList<Music> generatePlayList(ArrayList<Music> music){
      ArrayList<Music> playlist=new ArrayList<>();
      String name=super.getAuteur();
      for (Music music1:music){
          if (music1.getArtist().equalsIgnoreCase(music1.getArtist())){
              playlist.add(music1);
          }
      }
        System.out.println("You generate new play list for artist: "+artist+" and the new list :"+ playlist);
      return playlist;
    }
    @Override
    public String getMediaType(){
        if (super.getPrice()>=10){
            return "Premium Music";
        }else {
            return "Music";
        }
    }
//    listen(User user): Allows users to listen to music.
    public void listen(User user){
        System.out.println(user.getUserName()+" listen to "+getArtist());
    }

    @Override
    public String toString(){
        return super.toString()+" artist "+this.artist;
    }
}
