import java.util.Scanner;

public class AnagramChecker2 {
    public static void main(String[] args) {
        AnagramChecker2 ac = new AnagramChecker2();
        System.out.print(ac.solve());
    }

    private String solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = userInput.nextLine().trim();
        System.out.print("Enter the second word: ");
        String word2 = userInput.nextLine().trim();


        int[] alphabets = new int[26];

        for(char c : word1.toCharArray()) {
            alphabets[c - 'a']++;
        }

        for(char c : word2.toCharArray()) {
            alphabets[c - 'a']--;
        }

        for(int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] == 1) {
                return "is NOT anagram!";
            }
        }
        return "Is anagram!";
    }
}
