package DataStructure.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hi");
        stack.push("I'm");
        stack.push("Choi Seongdae");

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
    }
}
