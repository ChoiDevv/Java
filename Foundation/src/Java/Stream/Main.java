package Java.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] array = {"b", "c", "a", "d"};
        List<String> list = Arrays.asList(array);

        System.out.println("배열과 리스트에 대한 결과값");
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        Stream<String> array_stream = Arrays.stream(array);
        Stream<String> list_stream = list.stream();

        System.out.println("스트림을 활용한 정렬");
        System.out.println(Arrays.toString(array_stream.sorted().toArray()));
        System.out.println(Arrays.toString(list_stream.sorted().toArray()));

        Arrays.sort(array);
        Collections.sort(list);

        System.out.println("스트림을 활용하지 않은 정렬");
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        List<String> name_list = Arrays.asList("ad", "ac", "ae", "bd", "cd", "ce");
        List<String> temp_list = new ArrayList<>();

        System.out.println("a로 시작하는 단어를 대문자로 정렬하기");
        System.out.println("a로 시작하는 단어를 대문자로");
        for (String name: name_list) {
            if (name.startsWith("a")) {
                temp_list.add(name.toUpperCase());
            }
        }
        System.out.println(temp_list);
        System.out.println("정렬");
        Collections.sort(temp_list);
        System.out.println(temp_list);

        System.out.println(name_list.stream()
                .filter(name -> name.startsWith("a"))
                .sorted()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList()));
    }
}
