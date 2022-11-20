package OOP;

public class Service implements ServiceImpl {

    @Override
    public ResponseDto add(RequestDto requestDto) {
        ResponseDto response = new ResponseDto();
        response.add(requestDto.getFirstNumber(), requestDto.getSecondNumber());

        return response;
    }
}
