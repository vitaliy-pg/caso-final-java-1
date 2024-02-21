import java.util.Scanner;

class InterplanetaryCommunicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        // Count vowels
        int vowelCount = countVowels(message);
        System.out.println("Vowel count: " + vowelCount);

        // Reverse message
        String reversedMessage = reverseMessage(message);
        System.out.println("Reversed message: " + reversedMessage);

        // Check if message is a palindrome
        boolean isPalindrome = isPalindrome(message);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    // Function to count vowels in a message
    public static int countVowels(String message) {
        int count = 0;
        for (char c : message.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // Function to reverse a message
    public static String reverseMessage(String message) {
        StringBuilder reversed = new StringBuilder();
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed.append(message.charAt(i));
        }
        return reversed.toString();
    }

    // Function to check if a message is a palindrome
    public static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }
}
