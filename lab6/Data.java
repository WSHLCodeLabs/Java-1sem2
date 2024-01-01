import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {
    private ArrayList<String> dataList;
    private Scanner scanner;

    public int getUserChoice() {
        int choice;
        try {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            choice = 0;
        }
        return choice;
    }

    public Data() {
        dataList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Add text to back");
        System.out.println("2. Add text at index");
        System.out.println("3. Edit text");
        System.out.println("4. Remove text by index");
        System.out.println("5. Remove text by value");
        System.out.println("6. Exit");
    }

    public void addTextToBack(String text) {
        dataList.add(text);
        System.out.println("Text added to the back : " + text);
        System.out.println("Data : " + dataList);
        return;
    }

    public void addTextAtIndex(int index, String text) {
        if (index >= 0 && index <= dataList.size()) {
            dataList.add(index, text);
            System.out.println("Text added at index " + index + ": " + text);
            System.out.println("Data : " + dataList);
        } else {
            System.out.println("Invalid index. Text not added.");
        } return;
    }

    public void editText(int index, String newText) {
        if (index >= 0 && index < dataList.size()) {
            dataList.set(index, newText);
            System.out.println("Text at index " + index + " edited: " + newText);
            System.out.println("Data : " + dataList);
        } else {
            System.out.println("Invalid index. Text not edited.");
        } return;
        
    }

    public void removeTextByIndex(int index) {
        if (index >= 0 && index < dataList.size()) {
            String removedText = dataList.remove(index);
            System.out.println("Text removed at index " + index + ": " + removedText);
            System.out.println("Data : " + dataList);
        } else {
            System.out.println("Invalid index. Text not removed.");
        } return;
    }

    public void removeTextByValue(String text) {
        if (dataList.remove(text)) {
            System.out.println("Text removed: " + text);
            System.out.println("Data : " + dataList);
        } else {
            System.out.println("Text not found. Nothing removed.");
        } return;
    } 
}
