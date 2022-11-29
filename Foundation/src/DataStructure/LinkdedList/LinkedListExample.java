package DataStructure.LinkdedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("I'm");
        linkedList.addFirst("Hi");
        linkedList.add("Choi");
        linkedList.add("Seongdae");

        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.remove(2));

        System.out.println(linkedList);
    }
}
