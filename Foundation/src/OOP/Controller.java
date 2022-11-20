package OOP;

import java.io.IOException;

public class Controller {

    Service service = new Service();

    public ResponseDto calculation(RequestDto requestDto, int pickedNumber) throws IOException {
        return service.calculation(requestDto, pickedNumber);
    }
}