package OOP;

public class Front {

    public static void main(String[] args) {
        RequestDto requestDto = new RequestDto(1, 2);
        Controller controller = new Controller();
        System.out.println(controller.add(requestDto));
    }
}
