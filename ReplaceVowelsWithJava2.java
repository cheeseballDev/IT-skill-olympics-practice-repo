import java.util.Scanner;
public class ReplaceVowelsWithJava2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String word = userInput.nextLine().toLowerCase();
        String replacedWord = "";
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < word.length() - 1; i++) {
            if(isVowel(word.charAt(i))) {
                vowelCount++;
                replacedWord += "JAVA";
            } else {
                consonantCount++;
                replacedWord += word.charAt(i);
            }
        }
        
        System.out.println("Number of vowels = " + vowelCount);
        System.out.println("Number of consonants = " + consonantCount);
        System.out.println(replacedWord);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

