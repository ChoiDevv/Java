package OOP;

import java.io.IOException;

public class ResponseDto {

    private int result;

    public ResponseDto() {

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

    public void calculate(int firstNumber, int secondNumber, int pickedNumber) throws IOException {
        switch(pickedNumber) {
            case 1:
                add(firstNumber, secondNumber);
                break;
            case 2:
                minus(firstNumber, secondNumber);
                break;
            case 3:
                multiplication(firstNumber, secondNumber);
                break;
            case 4:
                divide(firstNumber, secondNumber);
                break;
            default:
                throw new IOException("Error");
        }
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
