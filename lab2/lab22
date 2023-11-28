import java.util.Scanner;

public class lab22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String emailAddress = scanner.nextLine();

        int atIndex = emailAddress.indexOf('@');
        if (atIndex != -1 && atIndex < emailAddress.length() - 1) {
            String domainAlias = emailAddress.substring(atIndex);
            System.out.println("Domain Alias: " + domainAlias);
        } else {
            System.out.println("Invalid email address. Unable to extract domain alias.");
     
        scanner.close();
    }
}
}
