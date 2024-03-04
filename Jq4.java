import java.security.SecureRandom;

public class jq4 {
    private static final String lower_char = "abcdefghijklmnopqrstuvwxyz";
    private static final String upper_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String special_char = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static void main(String[] args) {
        int length = 12; // Default password length
        boolean includeLowercase = true;
        boolean includeUppercase = true;
        boolean includeNumbers = true;
        boolean includeSpecialChars = true;

        // Generate the password
        String password = generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialChars);

        // Display the generated password
        System.out.println("Generated Password: " + password);
    }

    // Static method to generate a random password based on specified criteria
    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase,
                                           boolean includeNumbers, boolean includeSpecialChars) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Define characters to include based on criteria
        String characters = "";
        if (includeLowercase) {
            characters += lower_char;
        }
        if (includeUppercase) {
            characters += upper_char;
        }
        if (includeNumbers) {
            characters += NUMBERS;
        }
        if (includeSpecialChars) {
            characters += special_char;
        }

        // Generate password characters randomly
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
