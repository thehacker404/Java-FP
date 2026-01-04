public class SumLastDigits {
    public static int sumOfLastDigits(int num1, int num2) {
        int lastDigit1 = num1 % 10;  
        int lastDigit2 = num2 % 10;  
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 456;

        int result = sumOfLastDigits(num1, num2);
        System.out.println("Sum of last digits = " + result);
    }
}
