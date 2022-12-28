package Java.Abstract;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        NotBasket notBasket = new NotBasket();

        Purchase purchase = null;

        purchase = new Basket();
        purchase.basket();

        purchase = new NotBasket();
        purchase.basket();

        purchaseProduct(new Basket());
        purchaseProduct(new NotBasket());
    }

    private static void purchaseProduct(Purchase purchase) {
        purchase.basket();
    }
}