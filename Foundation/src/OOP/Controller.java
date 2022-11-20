package OOP;

public class Controller {

    public ResponseDto add(RequestDto requestDto) {
        Service service = new Service();
        return service.add(requestDto);
    }
}