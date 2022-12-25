package Java.Array;

public class StringClass {

    public static void main(java.lang.String[] args) {

        // String 클래스 주요 메소드
        String index_string = "12345";

        System.out.println("--문자열에서 char형 하나씩 출력--");
        for (int i = 0; i < index_string.length(); i++) {
            System.out.println(index_string.charAt(i));
        }

        System.out.println("--문자열을 인덱스부터 인덱스까지 출력");
        String sub_string = index_string.substring(1, 3);
        System.out.println(sub_string);

        System.out.println("--문자열이 같은지 비교--");
        String a = "abc";
        String b = "abc";

        if (a.equals(b)) {
            System.out.println("Yes");
        }
    }
}
