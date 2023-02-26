public class Product {
    String Name;
    String artNumber;
    float price;
    String description;
    boolean stock;

    public String getName() {
        return Name;
    }

    public String getArtNumber() {
        return artNumber;
    }


    public float getprice() {
        return price;

    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }
}


