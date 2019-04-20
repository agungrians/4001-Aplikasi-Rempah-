package android.example.com.aplikasirempah;

public class Product {

    private String Title;
    private String Price;
    private String Address;
    private int Thumbnail;

    public Product(){

    }

    public Product(String title, String price, String address, int thumbnail) {
        Title = title;
        Price = price;
        Address = address;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getPrice() {
        return Price;
    }

    public String getAddress() {
        return Address;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

