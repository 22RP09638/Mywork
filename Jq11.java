import java.util.Scanner;

public class jq11 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = c.nextInt();

        // Calculate sum of digits
        int sum = findsumofdigit(num);

        // Display the result
        System.out.println("Sum of digits: " + sum);

        c.close();
    }

    // Static method to calculate sum of digits
    public static int findsumofdigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
