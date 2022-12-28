package Java.Abstract;

public class Basket extends Purchase {

    public Basket() {
        this.type = "장바구니에 담고 주문";
    }

    @Override
    public void basket() {
        System.out.println("장바구니에 담는 로직으로 이동");
    }
}
