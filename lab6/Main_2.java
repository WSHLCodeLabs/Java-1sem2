import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Data d = new Data();
    Scanner scanner = new Scanner(System.in);
    int choice;
    while (true) {
      d.displayMenu();
      try {
        System.out.print("Enter your choice: ");
        choice = d.getUserChoice();
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine();
        continue;
      }
    
      switch (choice) {
                case 1:
                    System.out.println("=== Add text to back ===");
                    System.out.print("Enter text to add to the back : ");
                    String textToAdd = scanner.nextLine();
                    d.addTextToBack(textToAdd);
                    break;
                case 2:
                    System.out.println("=== Add text at index ===");
                    System.out.print("Enter index to add text at : ");
                    int indexToAdd = d.getUserChoice();
                    scanner.nextLine(); 
                    System.out.print("Enter text to add at index: ");
                    String textToAddAtIndex = scanner.nextLine();
                    d.addTextAtIndex(indexToAdd, textToAddAtIndex);
                    break;
                case 3:
                    System.out.println("=== Edit text ===");
                    System.out.print("Enter index to edit text: ");
                    int indexToEdit = d.getUserChoice();
                    scanner.nextLine(); 
                    System.out.print("Enter new text: ");
                    String newText = scanner.nextLine();
                    d.editText(indexToEdit, newText);
                    break;
                case 4:
                    System.out.println("=== Remove text by index ===");
                    System.out.print("Enter index to remove text : ");
                    int indexToRemove = d.getUserChoice();
                    scanner.nextLine();
                    d.removeTextByIndex(indexToRemove);
                    break;
                case 5:
                    System.out.println("=== Remove text by value ===");
                    System.out.print("Enter text to remove : ");
                    String textToRemove = scanner.nextLine();
                    d.removeTextByValue(textToRemove);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
