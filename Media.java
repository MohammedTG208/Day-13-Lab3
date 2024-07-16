import java.util.InputMismatchException;

public class Media {
    private String title;
    private String auteur;//how write the book.
    private String ISBN;
    private double price;

    public Media(String title , String auteur,String ISBN,double price){
        try {
            this.title=title;
            this.auteur=auteur;
            this.ISBN=ISBN;
            this.price=price;
        }catch (InputMismatchException e){
            System.out.println("Enter right value for input");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMediaType(){
        return "Media";
    }

    public String toString  (){
        return this.title+" The auteur: "+this.auteur+" the ISBN number: "+this.ISBN+" Price: "+this.price;
    }
}