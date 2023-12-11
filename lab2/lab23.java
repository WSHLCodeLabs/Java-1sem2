import java.util.Scanner;

public class lab23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxScore = Double.MIN_VALUE;
        String maxScoreStudentID = "";

        while (true) {
            System.out.print("Enter Student ID (or 'Q' to quit): ");
            String studentID = scanner.nextLine();

            if (studentID.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.print("Enter Score: ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            if (score > maxScore) {
                maxScore = score;
                maxScoreStudentID = studentID;
            }
        }

        if (!maxScoreStudentID.isEmpty()) {
            System.out.println("Maximum score is " + maxScore + " on " + maxScoreStudentID);
        } else {
            System.out.println("No valid scores entered.");
        }

        scanner.close();
    }
}
