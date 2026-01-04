import java.util.Scanner;

public class DigitSumOption {
    public static int digitSum(int num, boolean sumEven) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (sumEven && digit % 2 == 0) {
                sum += digit;
            } else if (!sumEven && digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Choose option (even/odd): ");
        String choice = sc.next().toLowerCase();

        boolean sumEven = choice.equals("even");
        int result = digitSum(num, sumEven);

        System.out.println("Sum of " + choice + " digits = " + result);
    }
}
