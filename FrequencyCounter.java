import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        FrequencyCounter fc = new FrequencyCounter();
        fc.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = userInput.nextLine();

        int[] letters = new int[26];

        for(char c : word.toLowerCase().toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                letters[c - 'a']++;
            }
        }

        for(int i = 0; i < letters.length; i++) {
            if(letters[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + letters[i]);
            }
        }
    }
}