import java.util.Scanner;
import java.math.BigInteger;

public class lab32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1: ");
        String input1 = scanner.next();

        System.out.print("Input 2: ");
        String input2 = scanner.next();

        BigInteger num1 = new BigInteger(input1);
        BigInteger num2 = new BigInteger(input2);

        BigInteger sum = num1.add(num2);

        System.out.println("Summation = " + sum);

        scanner.close();
    }
}
