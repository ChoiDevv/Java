package OOP;

public class Service implements ServiceImpl {

    @Override
    public ResponseDto add(RequestDto requestDto) {
        ResponseDto response = new ResponseDto();
        response.add(requestDto.getFirstNumber(), requestDto.getSecondNumber());
        return response;
    }

    @Override
    public ResponseDto minus(RequestDto requestDto) {
        ResponseDto response = new ResponseDto();
        response.minus(requestDto.getFirstNumber(), requestDto.getSecondNumber());
        return response;
    }

    @Override
    public ResponseDto multiplication(RequestDto requestDto) {
        ResponseDto response = new ResponseDto();
        response.multiplication(requestDto.getFirstNumber(), requestDto.getSecondNumber());
        return response;
    }

    @Override
    public ResponseDto divide(RequestDto requestDto) {
        ResponseDto response = new ResponseDto();
        response.divide(requestDto.getFirstNumber(), requestDto.getSecondNumber());
        return response;
    }
}
