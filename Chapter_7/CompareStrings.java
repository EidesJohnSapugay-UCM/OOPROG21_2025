import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args){
        String predefinedWord = "Carmen";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");
        String name = input.nextLine(); // store the entered name

        if (!name.equals(predefinedWord)) { // compare string values
            System.out.println(predefinedWord + " does not equal " + name);
        } else {
            System.out.println(predefinedWord + " is equal " + name);
        }

        input.close();
    }
}
