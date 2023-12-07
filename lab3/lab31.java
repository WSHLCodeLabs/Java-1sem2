import java.util.Scanner;

public class lab31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        int height = scanner.nextInt();

        int mid = height / 2;
        int count = 0;

        for (int i = 0; i < height; i++) {
            int spaces = Math.abs(mid - i);
            int stars = mid + 1 - spaces;

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
                count++;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println("\nCount of * is " + count);

        scanner.close();
    }
}
