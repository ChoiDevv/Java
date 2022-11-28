package Java.Transaction;

import java.io.IOException;
import java.util.Objects;

public class Product {

    String productName1 = "신라면";
    int price1 = 1000;

    String productName2 = "진라면";
    int price2 = 500;

    String productName3 = "참깨라면";
    int price3 = 750;

    public String getProductName1() {
        return productName1;
    }

    public int getPrice1() {
        return price1;
    }

    public String getProductName2() {
        return productName2;
    }

    public int getPrice2() {
        return price2;
    }

    public String getProductName3() {
        return productName3;
    }

    public int getPrice3() {
        return price3;
    }

    public Order select(String productName) throws IOException {
        Order order;

        try {
            Product product = new Product();
            int price = 0;
            if (Objects.equals(productName, "신라면")) {
                price = product.getPrice1();
            } else if (Objects.equals(productName, "진라면")) {
                price = product.getPrice2();
            } else {
                price = product.getPrice3();
            }
            order = new Order();
            order.save(productName, price);
        } catch (java.lang.Exception e) {
            throw new IOException("올바르지 않은 상품명을 입력했거나 알 수 없는 에러가 발생했습니다.");
        }

        return order;
    }
}
