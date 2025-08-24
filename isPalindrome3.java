
import java.util.Scanner;

public class isPalindrome3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String word = userInput.nextLine();
        word = word.trim();
        StringBuilder reversedWord = new StringBuilder();

        for(int i = word.length() - 1; i > -1; i--) 
            reversedWord.append(word.charAt(i));
        
        System.out.println(word.toLowerCase().equals(reversedWord.toString().toLowerCase()) ? "IS PALINDROME" : "NOT");
    }
}
