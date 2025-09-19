
import java.util.Scanner;


public class AnagramChecker3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = userInput.nextLine();

        System.out.print("Enter second word: ");
        String word2 = userInput.nextLine();


        int[] alphabet = new int[26];

        for(char c : word1.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for(char c : word2.toCharArray()) {
            alphabet[c - 'a']--;
        }

        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 1) {
                System.out.println("Not an anagram");
                System.exit(1);
            }
        }

        System.out.println("Is an anagram");
    }
}
