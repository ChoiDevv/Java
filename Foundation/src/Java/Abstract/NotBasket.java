package Java.Abstract;

public class NotBasket extends Purchase {

    public NotBasket() {
        this.type = "장바구니를 담지 않고 구매";
    }

    @Override
    public void basket() {
        System.out.println("장바구니에 담지 않고 실행되는 로직으로 이동");
    }
}
