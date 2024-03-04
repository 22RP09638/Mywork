import java.util.Scanner;

public class jq9{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = c.nextLine();

        // Check if the input string is a palindrome
        if (checkpalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        c.close();
    }

    // Static method to check if a string is a palindrome
    public static boolean checkpalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Continue checking characters from both ends until they meet
        while (left < right) {
            // Ignore non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Check if characters at left and right positions are equal (ignoring case)
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            // Move to the next pair of characters
            left++;
            right--;
        }

        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
