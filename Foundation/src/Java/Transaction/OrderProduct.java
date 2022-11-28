package Java.Transaction;

public class OrderProduct {

    private String productName;
    private int price;

    public OrderProduct() {

    }

    public OrderProduct(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public void save(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
}
