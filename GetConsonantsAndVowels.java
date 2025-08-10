package SchoolFolder;

import java.util.Scanner;

public class GetConsonantsAndVowels {
    public static void main(String[] args) {
        int consonantCount = 0;
        int vowelCount = 0;
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine().trim();
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == 'a') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'e') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'i') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'o') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'u') {
                vowelCount++;
            } else if (word.charAt(i) == ' ') {
                continue;
            } else {
                consonantCount++;
            }
        }
        System.out.println("The word " + word + " contains " + vowelCount + " vowels and " +consonantCount + "consonants");
    }
}
