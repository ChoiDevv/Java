package OOP;

public class ResponseDto {

    private int result;

    public ResponseDto() {

    }

    public ResponseDto(int result) {
        this.result = result;
    }

    public void add(int firstNumber, int secondNumber) {
        this.result = firstNumber + secondNumber;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "result=" + result +
                '}';
    }
}
