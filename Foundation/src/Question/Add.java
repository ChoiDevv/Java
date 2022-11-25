package Question;

/*
* 1000 까지 3과 5의 배수 합을 구해본다. (절차 지향 식으로 진행)
* 3의 배수 목록 + 5의 배수 목록 */

public class Add {
    public static void main(String[] args) {
        int result = 0;

        for (int num = 0; num < 1000; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                result += num;
            }
        }

        System.out.println(result);
    }
}
