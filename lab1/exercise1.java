import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance (in km): ");
        float x = input.nextFloat();

        float deliveryFee;

        if (x <= 4) {
            deliveryFee = 0;
        } else if (x <= 10) {
            deliveryFee = (x - 4) * 10;
        } else {
            deliveryFee = (10 - 4) * 10 + (x - 10) * 12;
        }

        System.out.println("Delivery fee: $" + deliveryFee);
    }
}
