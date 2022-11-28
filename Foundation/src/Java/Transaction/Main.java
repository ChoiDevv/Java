package Java.Transaction;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String userId = "anonymous";
        String password;
        String productName;

        System.out.println("상품 구매를 예시로 한 트랜잭션 프로젝트입니다.");
        System.out.println("아이디를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        userId = scanner.next();

        System.out.println("비밀번호를 입력하세요.");
        password = scanner.next();

        User user = new User();
        String loggedInUserId = user.login(userId, password);
        System.out.println("현재 로그인된 아이디는 " + loggedInUserId + "입니다.");

        Product product = new Product();
        System.out.println("상품 정보입니다.");
        System.out.println(product.getProductName1() + "의 가격은 " + product.getPrice1() + "원입니다.");
        System.out.println(product.getProductName2() + "의 가격은 " + product.getPrice2() + "원입니다.");
        System.out.println(product.getProductName3() + "의 가격은 " + product.getPrice3() + "원입니다.");

        System.out.println("구매할 상품의 이름을 입력해주세요.");
        productName = scanner.next();
        Order order = product.select(productName);

        System.out.println("구매하신 상품은 " + order.getProductName() + "입니다.");
        System.out.println("해당 가격은 " + order.getPrice() + "원입니다.");

        OrderProduct orderProduct = new OrderProduct();
        orderProduct.save(order.getProductName(), order.getPrice());

        System.out.println("구매해주셔서 감사합니다.");
    }
}
