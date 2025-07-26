class prodDemo{

    private String itemno;
    private String name;
    private int quantity;
    private double price;

    public String getItemo() {
        return itemno;
    }

    public String getName() {
        return name;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
    public void Products(String itemno,String name, double price, int quantity){
        this.itemno=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(quantity);

    }
}
public class Products {
    public static void main(String[] args) {

    }
}
