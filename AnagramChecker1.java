import java.util.Scanner;

public class AnagramChecker1 {
    public static void main(String[] args) {
        AnagramChecker1 ag = new AnagramChecker1();
        ag.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter word 1: ");
        String word1 = userInput.nextLine().toLowerCase();
        System.out.print("Enter word 2: ");
        String word2 = userInput.nextLine().toLowerCase();

        System.out.println(isAnagram(word1, word2));
    }

    private String isAnagram(String word1, String word2) {
        if(word1.length() != word2.length()) {
            return "Not anagram";
        }

        int[] counts = new int[26];

        for (char c : word1.toCharArray()) {
            counts[c - 'a']++; 
        }

        for (char c: word2.toCharArray()) {
            counts[c - 'a']--;
        }

        for(int i = 0; i < counts.length; i++) 
            if(counts[i] != 0)
                return "Is not anagram";

        return "Is anagram";
        
    }
}
