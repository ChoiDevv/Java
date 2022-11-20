package OOP;

public class ResponseDto {

    private int result;

    public ResponseDto() {

    }

    public ResponseDto(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "result=" + result +
                '}';
    }

    public void add(int firstNumber, int secondNumber) {
        this.result = firstNumber + secondNumber;
    }

    public void minus(int firstNumber, int secondNumber) {
        this.result = firstNumber - secondNumber;
    }

    public void multiplication(int firstNumber, int secondNumber) {
        this.result = firstNumber * secondNumber;
    }

    public void divide(int firstNumber, int secondNumber) {
        this.result = firstNumber / secondNumber;
    }
}
