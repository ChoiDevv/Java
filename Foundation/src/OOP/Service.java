package OOP;

import java.io.IOException;

public class Service implements ServiceImpl {
    @Override
    public ResponseDto calculation(RequestDto requestDto, int pickedNumber) throws IOException {
        ResponseDto response = new ResponseDto();
        response.calculate(requestDto.getFirstNumber(), requestDto.getSecondNumber(), pickedNumber);
        return response;
    }
}
