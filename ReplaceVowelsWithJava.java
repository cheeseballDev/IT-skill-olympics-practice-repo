import java.util.Scanner;

public class ReplaceVowelsWithJava {
    public static void main(String[] args) {
        ReplaceVowelsWithJava obj = new ReplaceVowelsWithJava();
        obj.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        String userWord = userInput.nextLine();
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < userWord.length(); i++) {
            if (userWord.toLowerCase().charAt(i) == 'a' || userWord.toLowerCase().charAt(i) == 'e' || userWord.toLowerCase().charAt(i) == 'i' || userWord.toLowerCase().charAt(i) == 'o' || userWord.toLowerCase().charAt(i) == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        
        System.out.println("Output:");
        System.out.println("Vowel = " + vowelCount);
        System.out.println("Consonant = " + consonantCount);
        System.out.println(userWord.replaceAll("[AEIOUaeiou]", "JAVA"));
    }
}
