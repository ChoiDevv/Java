package OOP;

public class Controller {

    Service service = new Service();

    public ResponseDto add(RequestDto requestDto) {
        return service.add(requestDto);
    }

    public ResponseDto minus(RequestDto requestDto) {
        return service.minus(requestDto);
    }

    public ResponseDto multiplication(RequestDto requestDto) {
        return service.multiplication(requestDto);
    }

    public ResponseDto divide(RequestDto requestDto) {
        return service.divide(requestDto);
    }
}