import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        CountWords cw = new CountWords();
        cw.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = userInput.nextLine();
        
        int count = 0;
        for(String word : sentence.trim().split("\\s+")) {
            count++;
        }

        System.out.print("The number of words in that sentence is " + count);
    }
}
