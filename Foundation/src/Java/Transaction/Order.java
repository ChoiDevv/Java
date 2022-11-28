package Java.Transaction;

public class Order {
    public String productName;
    public int price;

    public Order() {

    }

    public Order(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public void save(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
}
