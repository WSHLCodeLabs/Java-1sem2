import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSum(number);
        System.out.println("The sum of digits is: " + sum);

        scanner.close();
    }

    public static int calculateSum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + calculateSum(num / 10);
        }
    }
}
