import java.util.Scanner;

public class CountReplace {
    
    public static void main(String[] args) {
        CountReplace cr = new CountReplace();
        cr.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        String word = userInput.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().charAt(i) == 'a') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'e') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'i') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'o') {
                vowelCount++;
            } else if (word.toLowerCase().charAt(i) == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.print("Vowel = " + vowelCount);
        System.out.print("\nConsonant = " + consonantCount);

        System.out.println("");
        System.out.println(word.replaceAll("[AEIOUaeiou]", "JAVA"));
    }
}
