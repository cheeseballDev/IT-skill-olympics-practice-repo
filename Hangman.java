import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();
        String[] words = {"banana", "tower", "mika"};
        
        String chosenWord = words[rnd.nextInt(words.length)];
        String blurredWord = "";

        int wrong = 0;

        for(int i = rnd.nextInt(chosenWord.length()); i < chosenWord.length(); i++) {
            blurredWord = chosenWord.replaceAll("[A-Z]", "*");
        }

        String guess = "";
        while(wrong < 5 && blurredWord.contains("_")) {
            System.err.print("The word is " + blurredWord);

            guess = userInput.nextLine().toUpperCase();

            
        }
    }
}
