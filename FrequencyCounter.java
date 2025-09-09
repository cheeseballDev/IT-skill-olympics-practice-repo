import java.util.HashMap;
import java.util.Map;
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

        Map<Character, Integer> freq = new HashMap();

        for(char c: word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}