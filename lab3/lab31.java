import java.util.Scanner;

public class lab31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit odd number: ");
        int height = scanner.nextInt();

        int mid = height / 2;
        int count = 0;

        for (int i = 0; i < height; i++) {
            int spaces = Math.abs(mid - i);
            int stars = mid + 1 - spaces;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
                count++;
            }

            System.out.println();
        }

        System.out.println("\nCount of * is " + count);

        scanner.close();
    }
}
