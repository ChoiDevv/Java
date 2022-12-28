package Java.Abstract;

public abstract class Purchase {

    public String type;

    public void purchase() {
        System.out.println("구매하는 로직으로 이동시킨다.");
    }

    public abstract void basket();
}
