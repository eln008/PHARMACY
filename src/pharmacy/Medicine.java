package pharmacy;

public class Medicine {
    
    private  String name;
    private int price;
    private int quantity;

    public Medicine(String name, int price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public Medicine() {

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

