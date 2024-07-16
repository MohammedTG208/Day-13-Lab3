import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> purchasedMediaList;
    private ArrayList<Media> shppingCart;

    public User(String userName, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> shppingCart) {
        this.userName = userName;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shppingCart = shppingCart;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShppingCart() {
        return shppingCart;
    }

    public void setShppingCart(ArrayList<Media> shppingCart) {
        this.shppingCart = shppingCart;
    }
    public void addToCart(Media media){
      this.shppingCart.add(media);
    }

    public void removeFromCart(Media media){
        this.shppingCart.remove(media);
        System.out.println("remove successfully");
    }
//    checkout(): Completes the purchase and updates purchased media list and stock.
    public void checkOut(Media media){
        this.purchasedMediaList.add(media);
        this.shppingCart.clear();
        System.out.println("Checkout completed");
    }

}
