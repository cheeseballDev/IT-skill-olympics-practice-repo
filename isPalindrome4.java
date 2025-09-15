import java.util.Scanner;

public class isPalindrome4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word = userInput.nextLine();

        int wordLength = word.length();

        String reversedWord = "";
        for(int i = wordLength - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        String condition = word.equals(reversedWord) ? "Is palindrome" : "Not";
        System.out.println(condition);

    }
}
