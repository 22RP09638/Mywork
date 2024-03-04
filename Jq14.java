import java.util.Scanner;

public class jq14 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string:");
        String input = c.nextLine();

        // Call the static method to reverse the string
        String reversedString = revstring(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        c.close();
    }

    // Static method to reverse a string
    public static String revstring(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
