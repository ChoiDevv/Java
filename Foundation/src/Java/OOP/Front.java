package Java.OOP;

import java.io.IOException;
import java.util.Scanner;

public class Front {

    public static void main(String[] args) throws IOException {
        int pickedNumber;
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("객체지향 계산기입니다.\n");
        System.out.println("1: 더하기, 2: 빼기, 3: 곱하기, 4: 나누기 >> 해당 번호를 입력해주세요.");
        pickedNumber = scanner.nextInt();
        System.out.println("첫번째 숫자를 입력하세요:");
        firstNumber = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요:");
        secondNumber = scanner.nextInt();

        RequestDto requestDto = new RequestDto(firstNumber, secondNumber);
        Controller controller = new Controller();

        System.out.println("계산 결과는 " + controller.calculation(requestDto, pickedNumber).getResult() + "입니다.");
    }
}
