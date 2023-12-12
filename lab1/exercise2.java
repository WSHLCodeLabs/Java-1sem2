import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number;
        do {
            System.out.print("Enter a number : ");
            number = input.next();
        } while (!isValidInput(number));

        String encodedNumber = encode(number);
        System.out.println("Encoded number: " + encodedNumber);

        input.close();
    }

    private static boolean isValidInput(String number) {
        return number.length() <= 8 && !number.startsWith("0");
    }

    private static String encode(String number) {
        StringBuilder encodedNumber = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);

            if (digit % 2 == 1) {
                digit--;
            } else {
                digit++;
            }
            if (digit == '0') {
                digit = '1';
            }

            encodedNumber.append(digit);
        }

        return encodedNumber.toString();
    }
}
