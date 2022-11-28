package Java.OOP;

import java.io.IOException;

public interface ServiceImpl {
    ResponseDto calculation(RequestDto requestDto, int pickedNumber) throws IOException;
}
